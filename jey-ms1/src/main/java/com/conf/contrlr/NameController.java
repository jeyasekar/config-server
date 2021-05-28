package com.conf.contrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class NameController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/bank-account/{name}")
	public void getBankAccount(@PathVariable("accountId") String name){
		
		log.debug("acc");
		System.out.println(configuration.getName());
		
		//return ResponseEntity.ok(account);				
	}
	
}
