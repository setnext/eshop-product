package com.setnext.eshop.products.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.setnext.eshop.products.entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{ categories: ?0 }")
	
	Page<Product> findByCategories(String category,Pageable pageable);
	
}
