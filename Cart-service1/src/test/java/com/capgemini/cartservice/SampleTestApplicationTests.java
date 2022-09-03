package com.capgemini.cartservice;


import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.entity.Items;
import com.capgemini.cartservice.repository.CartRepository;
import com.capgemini.cartservice.service.CartService;


@RunWith(SpringRunner.class)
class SampleTestApplicationTests {
	@Autowired
	private CartService service;

	@MockBean
	private CartRepository repository;
	
	
	@Test
	public void getAllcartsTest()
	{
		Items item= new Items(22,"aa",10.0,20);
		List<Items> items=new ArrayList<Items>();
		items.add(item);
		when(repository.findAll())
		.thenReturn(Stream.of(new Cart(555,5000.00, items),new Cart(556,6000.00,items)).collect(Collectors.toList()));
		assertEquals(2,service.getallcarts().size());
		//assertEquals(0,0);
	}
	


}
