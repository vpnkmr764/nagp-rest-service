package com.app.nagp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author vipin kumar
 * 
 * Entity class for orders table
 */

@Entity
public class Orders {	
	@Id
	private Integer id;	
	@Column(name = "user_key")
	private Integer userKey;	
	private String side;
	private Double amount;	
	private Double quantity;
	
	public Integer getId() {
		return id;
	}
	public Integer getUserKey() {
		return userKey;
	}
	public String getSide() {
		return side;
	}
	public Double getAmount() {
		return amount;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUserKey(Integer userKey) {
		this.userKey = userKey;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
}