package hn.com.jf.models;

import lombok.Data;

@Data
public class Item {
	
	public Item(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	private Product product;
	
	private Integer quantity;
	
	public int getAmount() {
		return quantity * product.getPrice();
	}
}
