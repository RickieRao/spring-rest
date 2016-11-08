package org.ar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ConfigurationProperties(prefix = "spring")
public class SpringRestApplication {

	private String greeting;

	@RequestMapping("/")
	public String home(){
		return greeting;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
