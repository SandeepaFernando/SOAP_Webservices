package com.market.model;

import java.io.Serializable;

public class Asserts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2943290335802660637L;
	
	private int assertId;
	private String assertName;
	private int quantity;
	
	public int getAssertId() {
		return assertId;
	}
	public void setAssertId(int assertId) {
		this.assertId = assertId;
	}
	public String getAssertName() {
		return assertName;
	}
	public void setAssertName(String assertName) {
		this.assertName = assertName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Asserts [assertId=" + assertId + ", assertName=" + assertName + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
