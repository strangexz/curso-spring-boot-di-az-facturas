package hn.com.jf;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import hn.com.jf.models.Item;
import hn.com.jf.models.Product;

@Configuration
@PropertySources({ @PropertySource("classpath:data.properties") })
public class Config {

	@Bean
	List<Item> itemsInvoice() {
		Product product1 = new Product("Camara Sony", 800);
		Product product2 = new Product("Bicicleta Bianchi", 1200);
		
		return Arrays.asList(new Item(product1, 2), new Item(product2, 4));
	}
}
