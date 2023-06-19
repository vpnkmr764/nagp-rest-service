package com.app.nagp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nagp.entities.Orders;
import com.app.nagp.repository.OrderRepository;

/**
 * @author vipin kumar
 * This service class is responsible for communicating with order dao layer
 */

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;	 
		
	@Transactional
	public List<Orders> getOrdersByUser(final Integer userKey){
		return orderRepository.findByUserKey(userKey);
	}
}