package hn.com.jf.models;

import lombok.Data;

@Data
public class Product {

	public Product() {

	}

	public Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	private String name;
	
	private Integer price;
}
