package com.app.nagp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.nagp.entities.Orders;
import com.app.nagp.service.OrderService;

/**
 * @author vipin kumar
 * 
 * Controller which is responsible for handling orders related operations 
 */
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
    /* 
     * Fetches orders of a user
 	*/
	@GetMapping(value = "/getOrdersByUser/{userKey}")
	public List<Orders> getOrders(@PathVariable("userKey") final Integer userKey) {
		return orderService.getOrdersByUser(userKey);
	}
}