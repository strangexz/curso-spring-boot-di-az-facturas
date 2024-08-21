package hn.com.jf.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;

@Component
@RequestScope
@JsonIgnoreProperties({"targetSource", "advisors"})
@Data
public class Invoice {
	@Autowired
	private Client client;

	@Value("${invoice.description}")
	private String description;

	@Autowired
	private List<Item> items;
	
	public Invoice() {
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Creando el componente de la factura!");
		description = "Agregando descripción en el Post Constructor";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destruyendo el componente o bean invoice");
	}

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
