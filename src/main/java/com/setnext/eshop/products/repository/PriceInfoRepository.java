package com.setnext.eshop.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setnext.eshop.products.entities.Product_sql;

public interface PriceInfoRepository extends JpaRepository<Product_sql,Long> {

}
