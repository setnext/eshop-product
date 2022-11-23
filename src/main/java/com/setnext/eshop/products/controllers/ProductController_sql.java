//package com.setnext.eshop.products.controllers;
//
//import java.net.URI;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import com.setnext.eshop.products.entities.Product;
//import com.setnext.eshop.products.entities.Product_sql;
//import com.setnext.eshop.products.exceptions.ProductNotFoundException;
//import com.setnext.eshop.products.repository.ProductRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.ResponseStatusException;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import jakarta.validation.Valid;
//
//@RestController
//public class ProductController_sql {
//	
//	@Autowired
//	private ProductRepository repository;
//	
//	
////	@RequestMapping(method=RequestMethod.GET,path="/products")
//	@GetMapping(path="/products")
//	public List<Product_sql> getAllProducts(){
//		
//		return repository.findAll();
//		
////		return Arrays.asList(
////				new Product(1, "Apple", "Sweet Fruit", "http://fruiturl.org", "http://fruiturl.org", 10.5),
////				new Product(1, "Orange", "Tangy Fruit", "http://fruiturl.org", "http://fruiturl.org", 20.5),
////				new Product(1, "grapes", "Tangy Fruit", "http://fruiturl.org", "http://fruiturl.org", 20.5)); 		
////		
//		
//	}
//	
//	@PostMapping("/products")
//	public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product)
//	{
//		System.out.println("Saved");
//		System.out.println(product.toString());
//		
//		
//		repository.save(product);
//		
//		
//		System.out.println("------************-------");
//		System.out.println("");
//		System.out.println("");
//		System.out.println("");
//		
//		System.out.println("product Id" + product.getId());
//		
//		
//		
//		System.out.println("");
//		System.out.println("");
//		System.out.println("");
//		
//		
//		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(product.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//		
//	}
//	
//	@GetMapping("/products/{id}")
//	public Product findProduct(@PathVariable long id) throws Exception
//	{
//		
//		Optional<Product> prd = repository.findById(id);
//		
//		if (prd.isEmpty()) {
//			 throw new ProductNotFoundException(String.format("Product with id %d not found",id));
//	    }
//		
//		else {
//			
//			return prd.get();
//			
//		}
//		
//		
//	}
//
//	
//	
//	
//	
//	
//	
//
//}
