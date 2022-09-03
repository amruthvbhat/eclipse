package com.capgemini.productservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.productservice.entity.Product;
import com.capgemini.productservice.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public void addProduct(@RequestBody Product product)
	{
		service.addProduct(product);
	}
	
	@GetMapping("/getall")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@GetMapping("/getid/{id}")
	public Optional<Product> getProductById(@PathVariable("id") Integer ProductId)
	{
		return service.getProductById(ProductId);
	}
	
	@GetMapping("/getname/{Name}")
	public Optional<Product> getProductByName(@PathVariable("Name") String Name)
	{
		return service.getProductByName(Name);
	}
	
	@DeleteMapping("/deleteproduct/{ProductId}")
	public String deleteProductById(@PathVariable("ProductId") Integer ProductId)
	{
		service.deleteProductById(ProductId);
		return "Product is deleted";
		
	}
	
	//getProductByCategory
	@GetMapping("/getcategory/{Category}")
	public List<Product> getProductByCategory(@PathVariable("Category") String Category)
	{
		return service.getProductByCategory(Category);
	}
	
	//getProductByType
	@GetMapping("/getproducttype/{ProductType}")
	public List<Product> getProductByType(@PathVariable("ProductType") String ProductType)
	{
		return service.getProductByType(ProductType);
	}
	
	@PutMapping("/update/{id}")
	public Product updateProducts(@PathVariable("id")Integer ProductId,@RequestBody Product product)
	{
		return service.updateProducts(ProductId,product);
	}
	
	
	
	
	
	

}
