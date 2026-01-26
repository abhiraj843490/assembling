package com.assembling;

import com.assembling.customAnnotations.UseCustomAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbhiPrepApplication {
//	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(AbhiPrepApplication.class, args);
		UseCustomAnnotation useCustomAnnotation = new UseCustomAnnotation();
		useCustomAnnotation.service();
	}

}
