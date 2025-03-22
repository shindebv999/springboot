package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
//we can it's own proprties file
@PropertySource(value="classpath:app.properties")
@PropertySource(value="classpath:application2.properties")

@SpringBootApplication
public class starter {

	public static void main(String[] args) {
		SpringApplication.run(starter.class, args);
	}

}
