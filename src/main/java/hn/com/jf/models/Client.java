package hn.com.jf.models;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Client {
	private String name;
	private String lastname;
}
