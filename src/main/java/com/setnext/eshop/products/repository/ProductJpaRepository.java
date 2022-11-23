package com.setnext.eshop.products.repository;


import org.springframework.stereotype.Repository;

import com.setnext.eshop.products.entities.Product_sql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Product_sql product) {
		
		entityManager.merge(product);
		
	}
	
	public Product_sql findById(Long id) {
		 return entityManager.find(Product_sql.class,id);
		
	}

}
