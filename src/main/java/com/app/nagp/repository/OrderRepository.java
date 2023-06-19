package com.app.nagp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nagp.entities.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> { 	
	List<Orders>  findByUserKey(Integer userKey);
}
