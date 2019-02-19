package com.springys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class FighitingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FighitingApplication.class, args);
	}

}

