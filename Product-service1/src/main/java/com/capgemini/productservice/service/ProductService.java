package com.capgemini.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.productservice.entity.Product;

@Service
public interface ProductService {
	void addProduct(Product product);//done
	List<Product> getAllProducts();//done
	Optional<Product> getProductById(Integer ProductId);//done
	Optional<Product> getProductByName(String ProductName);//no
		
	void deleteProductById(Integer ProductId);//done
	List<Product> getProductByCategory(String Category);		//2
	List<Product> getProductByType(String ProductType);		//3
	Product updateProducts(Integer ProductId, Product product);//1	//done
	
	

}
