package com.capgemini.cartservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.entity.Items;
import com.capgemini.cartservice.repository.CartRepository;
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository repository;

	@Override
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		repository.save(cart);
		
	}

	@Override
	public Cart getcartById(Integer CartId) {
		// TODO Auto-generated method stub
		Cart cart = repository.findById(CartId).orElse(null);
		return cart;
	}

	@Override
	public Cart updateCart(Integer id,Items items) {
		// TODO Auto-generated method stub
		Cart newCart = repository.findById(id).orElse(null);
		if(newCart.getListOfItems()== null)
		{
			List<Items> newitem = new ArrayList<Items>();
			newitem.add(items);
			newCart.setListOfItems(newitem);
		}
		else
		{
			List<Items> olditems = newCart.getListOfItems();
			olditems.add(items);
			newCart.setListOfItems(olditems);
			
		}
		newCart.setTotalPrice(newCart.getTotalPrice()+(items.getPrice()*items.getQuantity()));
		repository.save(newCart);
		return newCart;
	}

	@Override
	public List<Cart> getallcarts() {
		// TODO Auto-generated method stub

		return repository.findAll();
	}
	@Override
	public List<Items> getallItems(Integer CartId) {
		// TODO Auto-generated method stub
		Cart cart = repository.findById(CartId).orElse(null);
		return cart.getListOfItems();
	}

	@Override
	public double cartTotal(Integer cartId) {
		// TODO Auto-generated method stub
		Cart newCart = repository.findById(cartId).orElse(null);
		return newCart.getTotalPrice();
	}

	@Override
	public void deleteItem(Integer cartId, Integer itemId) {
		// TODO Auto-generated method stub
		Cart cart = repository.findById(cartId).orElse(null);
		for(Items items : cart.getListOfItems())
		{
			if(items.getItemId()== itemId)
			{
				cart.setTotalPrice(cart.getTotalPrice()-(items.getQuantity()*items.getPrice()));
				cart.getListOfItems().remove(items);
				repository.save(cart);
			}
		}
		
	}

	

}
