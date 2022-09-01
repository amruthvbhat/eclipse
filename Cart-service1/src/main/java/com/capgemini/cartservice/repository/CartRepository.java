package com.capgemini.cartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.capgemini.cartservice.entity.Cart;
@Repository
//@EnableMongoRepositories

public interface CartRepository extends MongoRepository<Cart, Integer>{
	
}
