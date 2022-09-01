package com.capgemini.cartservice.entity;

import java.util.List;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document("items")
@ToString
@AllArgsConstructor 
@NoArgsConstructor 

public class Items {
	private int itemId;
	private String productName;
	private double price;
	private int quantity;
	
	public Items(Items item)
	{
		itemId=item.getItemId();
		productName= item.getProductName();
		price=item.getPrice();
		quantity=item.getQuantity();
	}
	
	
	public Items(String productName, double price, int quantity, int itemId) {
		super();
		this.itemId = itemId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}



	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	
	
	
}
