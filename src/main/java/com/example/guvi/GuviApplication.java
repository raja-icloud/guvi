package com.example.guvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class GuviApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuviApplication.class, args);
	}

	@GetMapping("")
	public String getMethodName() {
		return new String("Server Started");
	}
	

}
