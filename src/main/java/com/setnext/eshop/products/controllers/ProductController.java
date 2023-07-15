package com.setnext.eshop.products.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.setnext.eshop.products.entities.Product;
import com.setnext.eshop.products.exceptions.ProductNotFoundException;
import com.setnext.eshop.products.repository.ProductRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@CrossOrigin(origins = "*",allowedHeaders ="*",exposedHeaders = "*", maxAge = 3600)
@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;


//	@RequestMapping(method=RequestMethod.GET,path="/products")
	@GetMapping(path="/products")
	public List<Product> getAllProducts(){

		return repository.findAll();

	}
	
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product)
	{

		System.out.println(product.toString());


		Product p1 = repository.save(product);
		System.out.println("Product Saved Successfully");




		System.out.println(p1.get_id());

		System.out.println("------************-------");
		System.out.println("");
		System.out.println("");
		System.out.println("");




		System.out.println("");
		System.out.println("");
		System.out.println("");



//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(product.getId())
//				.toUri();
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(product.get_id())
				.toUri();
//		HttpHeaders responseHeaders = new HttpHeaders();
//		List<String> allowedHeaders = new ArrayList<>();
//		allowedHeaders.add("Location");
//		responseHeaders.put("Access-Control-Expose-Headers", allowedHeaders);  
//	ResponseEntity<Product> pr =  new ResponseEntity<Product>(p1,responseHeaders,HttpStatus.CREATED) ;
//		return pr;
		return ResponseEntity.created(location).build();

	}




	@GetMapping("/products/{id}")
	public ResponseEntity<Product> findProduct(@PathVariable String id) throws Exception
	{

		Optional<Product> prd = repository.findById(id);

		if (prd.isEmpty()) {
			 throw new ProductNotFoundException(String.format("Product with id %d not found",id));
	    }

		else {

			return new ResponseEntity<>(prd.get(), HttpStatus.OK);

		}


	}
	@GetMapping("/products/find/{name}")
	public ResponseEntity<Map<String, Object>> findProductByName(@PathVariable String name) throws Exception
	{
		System.out.println("Finding Products By Name ");

		Optional<Product> prd = repository.findByProductName(name.trim());
		
		Map<String, Object> response = new HashMap<>();
		
		
		if (prd.isPresent()) {
			System.out.println("Product Found ");
			response.put("productFound", true);
			response.put("productId", prd.get().get_id());
			
			final String baseUrl = 
					ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString()+"/products";
			
			
			URI location = ServletUriComponentsBuilder.fromHttpUrl(baseUrl).path("/{id}")
					.buildAndExpand(prd.get().get_id())
					.toUri();
			
			response.put("locationUrl", location.toString());
			
			
	    }
		else
		{
			response.put("productFound", false);
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	     


	}


	@GetMapping("/products/categories/**")
	public ResponseEntity<Map<String, Object>> findProductsByCategory(HttpServletRequest request,@RequestParam(defaultValue = "0") int page,
		      @RequestParam(defaultValue = "8") int size) throws Exception
	{
		try {

			List<Product> products = new ArrayList<>();

			Pageable paging = PageRequest.of(page, size);

			Page<Product> pageTuts;

			String category = request.getServletPath().split("/products/categories")[1];

			if(category=="/") {
				throw new Exception("Unknown Category, Category cannot be root");
			}
			else
			{
				pageTuts = repository.findByCategories(category, paging);
			}

			products = pageTuts.getContent();

			Map<String, Object> response = new HashMap<>();
		      response.put("products", products);
		      response.put("currentPage", pageTuts.getNumber());
		      response.put("totalItems", pageTuts.getTotalElements());
		      response.put("totalPages", pageTuts.getTotalPages());

			System.out.println(response);
			System.out.println(pageTuts.getNumberOfElements());


			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}



	}









}
