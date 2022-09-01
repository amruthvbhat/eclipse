package com.capgemini.cartservice.cartresource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.entity.Items;
import com.capgemini.cartservice.service.CartService;
@RestController
@RequestMapping("/cart")
public class CartResource {

	@Autowired
	private CartService service;
	
	@GetMapping("/getall")
	public List<Cart> getAllCarts()
	{
		return service.getallcarts();
	}
	
	@PostMapping("/save")
	public void addCart(@RequestBody Cart cart)
	{
		service.addCart(cart);
	}
	
	@GetMapping("/get/{id}")
	public Cart getCart(@PathVariable("id") Integer cartId)
	{
		return service.getcartById(cartId);
	}	
	@PutMapping("/update/{id}")
	public Cart updateCart(@PathVariable("id")Integer cartId,@RequestBody Items items)
	{
		return service.updateCart(cartId,items);
	}
	@GetMapping("/{cartId}/items")
	public List<Items> getAllItems(@PathVariable("cartId") Integer cartId)
	{
		return service.getallItems(cartId);
	}
	@GetMapping("/cartTotal/{id}")
	public double getCartTotal(@PathVariable("id") Integer cartId)
	{
		return service.cartTotal(cartId);
	}
	@DeleteMapping("/deleteitem/{cartid}/{itemid}")
	public String deleteItem(@PathVariable("cartid") Integer cartid,@PathVariable("itemid") Integer itemid)
	{
		service.deleteItem(cartid, itemid);
		return "Item deleted";
	}
}
