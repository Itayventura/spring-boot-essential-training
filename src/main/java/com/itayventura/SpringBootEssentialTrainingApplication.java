package com.itayventura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootEssentialTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEssentialTrainingApplication.class, args);
	}

	@RestController
	@RequestMapping("/api")
	public class ApiController{

			@GetMapping
			public String getGreeting(){
				return "hello world from the api";
			}
		}
}
