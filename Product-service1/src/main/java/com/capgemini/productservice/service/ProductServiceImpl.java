package com.capgemini.productservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.productservice.entity.Product;
import com.capgemini.productservice.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;
	
	

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		repository.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Product> getProductById(Integer ProductId) {
		// TODO Auto-generated method stub
		Optional<Product> product=Optional.of(repository.findById(ProductId).orElse(null));
		return product;
	}

	@Override
	public Optional<Product> getProductByName(String ProductName) {
		// TODO Auto-generated method stub
		//List<Product> listproduct = new ArrayList<>();
		
		return repository.findByProductName(ProductName);
	}

	@Override
	public void deleteProductById(Integer ProductId) {
		// TODO Auto-generated method stub
		repository.deleteById(ProductId);
		
	}

	@Override
	public Product updateProducts(Integer ProductId,Product product) {
		// TODO Auto-generated method stub
		Product newproduct=repository.findById(ProductId).orElse(null);
		newproduct.setCategory(product.getCategory());
		newproduct.setDescription(product.getDescription());
		newproduct.setImage(product.getImage());
		newproduct.setPrice(product.getPrice());
		newproduct.setProductId(product.getProductId());
		newproduct.setProductName(product.getProductName());
		newproduct.setProductType(product.getProductType());
		newproduct.setRating(product.getRating());
		newproduct.setReview(product.getReview());
		newproduct.setSpecification(product.getSpecification());
		repository.save(newproduct);
		return newproduct;
		
	}

	@Override
	public List<Product> getProductByCategory(String Category) {
		return repository.findByCategory(Category);
	}

	@Override
	public List<Product> getProductByType(String ProductType) {
		// TODO Auto-generated method stub
		return repository.findByProductType(ProductType);
	}
	
	

}
