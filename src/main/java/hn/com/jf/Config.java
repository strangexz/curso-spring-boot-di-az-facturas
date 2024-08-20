package hn.com.jf;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import hn.com.jf.models.Item;
import hn.com.jf.models.Product;

@Configuration
@PropertySources({ @PropertySource("classpath:data.properties") })
public class Config {

	@Primary
	@Bean
	List<Item> itemsInvoice() {
		Product product1 = new Product("Camara Sony", 800);
		Product product2 = new Product("Bicicleta Bianchi", 1200);

		return Arrays.asList(new Item(product1, 2), new Item(product2, 4));
	}

	@Bean
	List<Item> itemsInvoiceOffice() {
		Product product1 = new Product("Monitor Asus 24", 700);
		Product product2 = new Product("Notebook Razer", 2400);
		Product product3 = new Product("Impresora HP", 800);
		Product product4 = new Product("Escritorio", 900);

		return Arrays.asList(new Item(product1, 4), new Item(product2, 6), new Item(product3, 1),
				new Item(product4, 4));
	}
}
