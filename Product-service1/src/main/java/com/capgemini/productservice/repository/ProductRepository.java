package com.capgemini.productservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.productservice.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{
	Optional<Product> findByProductName(String ProductName);
		
	List<Product> findByCategory(String Category);
	
	
	List<Product> findByProductType(String Category);
	
	

}
