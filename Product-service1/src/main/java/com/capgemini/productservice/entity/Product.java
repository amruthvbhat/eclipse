package com.capgemini.productservice.entity;


import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("product")
@AllArgsConstructor 
@NoArgsConstructor 
public class Product {
	@Id
	private int productId;
	private String productType;
	private String productName;
	private String Category;
	private Map<Integer,Double> rating;
	private Map<Integer,Double> review;
	private List<String> image; 
	private double price;
	private String description;
	private Map<String,String> specification;
	
	

}
