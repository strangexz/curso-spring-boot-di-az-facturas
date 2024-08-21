package hn.com.jf.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Component
@RequestScope
//@JsonIgnoreProperties({"targetSource", "advisors"})
@Data
public class Client {
	@Value("${client.name}")
	private String name;
	
	@Value("${client.lastname}")
	private String lastname;
}
