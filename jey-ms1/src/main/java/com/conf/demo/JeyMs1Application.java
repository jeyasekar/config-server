package com.conf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.conf.contrlr")
public class JeyMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(JeyMs1Application.class, args);
	}

}
