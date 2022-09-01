package com.capgemini.cartservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.entity.Items;
@Service
public interface CartService {
	void addCart(Cart cart);
	Cart getcartById(Integer CartId);
	Cart updateCart(Integer id,Items items);
	List<Cart> getallcarts();
	double cartTotal(Integer cartId);
	void deleteItem(Integer cartId,Integer itemId);
	List<Items> getallItems(Integer CartId);
}
