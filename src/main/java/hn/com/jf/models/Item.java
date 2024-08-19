package hn.com.jf.models;

import lombok.Data;

@Data
public class Item {
	
	public Item(Product product, Integer quantity) {
		this.product = product;
		Quantity = quantity;
	}
	
	private Product product;
	
	private Integer Quantity;
}
