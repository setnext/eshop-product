package com.setnext.eshop.products.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.setnext.eshop.products.entities.Category;
import com.setnext.eshop.products.repository.RangeRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@CrossOrigin
@RestController
public class RangeController {
	
	@Autowired
	private RangeRepository repository;
	
	
//	@RequestMapping(method=RequestMethod.GET,path="/products")
	@GetMapping(path="api/v1/range/categories")
	public List<Category> getAllProducts(){
		
		return repository.findAll();
		
//		return Arrays.asList(
//				new Product(1, "Apple", "Sweet Fruit", "http://fruiturl.org", "http://fruiturl.org", 10.5),
//				new Product(1, "Orange", "Tangy Fruit", "http://fruiturl.org", "http://fruiturl.org", 20.5),
//				new Product(1, "grapes", "Tangy Fruit", "http://fruiturl.org", "http://fruiturl.org", 20.5)); 		
//		
		
	}
	
	@GetMapping("api/v1/range/categories/{category_name}")
	public ResponseEntity<Object> findProductsByCategory(HttpServletRequest request) throws Exception
	{
		
		
		try {
			List<Category> categories = new ArrayList<Category>();
			String category = request.getServletPath().split("api/v1/range/categories")[1];
			
			if(category=="/") {
				throw new Exception("Unknown Category, Category cannot be root");
			}
			
				
			
			else
			{
				
				categories = repository.findByCategory(category);
			
			}
						
			System.out.println(categories);
		
			
			return new ResponseEntity<>(categories, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
	}
	
	
	@PostMapping("/api/v1/range/categories")
	public ResponseEntity<Category> createCategory(@Valid @RequestBody Category category)
	{
		
		System.out.println(category.toString());
		
		
		repository.save(category);
		System.out.println("Product Saved Successfully");
		
		
		
		
		
		
		System.out.println("------************-------");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{category}")
				.buildAndExpand(category.getCategory())
				.toUri();
		return ResponseEntity.created(location).build();
		
	}

}
