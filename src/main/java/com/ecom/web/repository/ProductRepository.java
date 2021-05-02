package com.ecom.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.web.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
	List<Product> findByCusine(String cusine);

}
