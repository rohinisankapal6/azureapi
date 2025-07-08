package com.example.testazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestazureApplication {

	@GetMapping("/welcome")
	public String demo(){
		return"API Management Service";
	}


	public static void main(String[] args) {
		SpringApplication.run(TestazureApplication.class, args);
	}

}
