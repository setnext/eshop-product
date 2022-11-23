package com.setnext.eshop.products.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.setnext.eshop.products.entities.Product;
import com.setnext.eshop.products.exceptions.ProductNotFoundException;
import com.setnext.eshop.products.repository.ProductMongoRepository;
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

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	private ProductMongoRepository repository;
	
	
//	@RequestMapping(method=RequestMethod.GET,path="/products")
	@GetMapping(path="/products")
	public List<Product> getAllProducts(){
		
		return repository.findAll();
		
//		return Arrays.asList(
//				new Product(1, "Apple", "Sweet Fruit", "http://fruiturl.org", "http://fruiturl.org", 10.5),
//				new Product(1, "Orange", "Tangy Fruit", "http://fruiturl.org", "http://fruiturl.org", 20.5),
//				new Product(1, "grapes", "Tangy Fruit", "http://fruiturl.org", "http://fruiturl.org", 20.5)); 		
//		
		
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
	
			
	
	@GetMapping("/products/categories/**")
	public ResponseEntity<Map<String, Object>> findProductsByCategory(HttpServletRequest request,@RequestParam(defaultValue = "0") int page,
		      @RequestParam(defaultValue = "8") int size) throws Exception
	{
		try {
			
			List<Product> products = new ArrayList<Product>();
			
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
