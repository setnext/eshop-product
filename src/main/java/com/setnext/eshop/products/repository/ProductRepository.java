package com.setnext.eshop.products.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setnext.eshop.products.entities.Product_sql;

public interface ProductRepository extends JpaRepository<Product_sql,Long> {
	
	
	List<Product_sql> findByName(String name);

}


