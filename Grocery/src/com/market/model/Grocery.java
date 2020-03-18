package com.market.model;

import java.io.Serializable;

public class Grocery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1036626514112514534L;
	
	private int itemId;
	private String itemName;
	private int quantity;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Grocery [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + "]";
	}
	
	

}
