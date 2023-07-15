package com.setnext.eshop.products.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.setnext.eshop.products.entities.Category;

public interface RangeRepository extends MongoRepository<Category, String> {



	List<Category> findByCategory(String category);

	List<Category> findByCategoryId(int categoryId);

}
