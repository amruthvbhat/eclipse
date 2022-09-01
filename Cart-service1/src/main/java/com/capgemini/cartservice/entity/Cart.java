package com.capgemini.cartservice.entity;


import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data 
@Document("cart")
@AllArgsConstructor 
@NoArgsConstructor 
public class Cart {
	@Id
	private int cartId;
	private double totalPrice;
	
	@Field
	private List<Items> listOfItems;
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
