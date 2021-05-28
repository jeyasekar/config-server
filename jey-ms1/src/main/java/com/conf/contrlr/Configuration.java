package com.conf.contrlr;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix="name-service")
public class Configuration {
	
	@Setter
	@Getter
	private String name;
	
	
}
