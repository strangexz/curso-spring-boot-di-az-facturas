package hn.com.jf.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Invoice {
	@Autowired
	private Client client;
	private String description;
	private List<Item> items;
}
