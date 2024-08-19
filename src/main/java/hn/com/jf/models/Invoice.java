package hn.com.jf.models;

import java.util.List;

import lombok.Data;

@Data
public class Invoice {
	private Client client;
	private String description;
	private List<Item> items;
}
