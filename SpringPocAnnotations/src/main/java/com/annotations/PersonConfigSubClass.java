package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersonConfig.class)
public class PersonConfigSubClass {
	@Bean
	public PersonConfig personConfIg (){
		return new PersonConfig();
	}
	

}
