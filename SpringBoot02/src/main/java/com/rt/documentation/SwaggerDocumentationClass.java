package com.rt.documentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerDocumentationClass {
 
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2);
	}
}
