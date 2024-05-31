package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
		System.out.println("completed");
		//System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
	}

}
