package hn.com.jf.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Invoice {
	@Autowired
	private Client client;

	@Value("${invoice.description}")
	private String description;

	@Autowired
	private List<Item> items;

	public int getTotal() {
		int total;
		
//		total = 0;
//		for (Item item : items) {
//			total += item.getAmount();
//		}

		total = items.stream().map(item -> item.getAmount()).reduce(0, (sum, amount) -> sum + amount);

		return total;
	}
}
