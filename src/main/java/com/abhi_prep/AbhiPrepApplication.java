package com.abhi_prep;

import com.abhi_prep.customAnnotations.UseCustomAnnotation;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class AbhiPrepApplication {
//	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(AbhiPrepApplication.class, args);
		UseCustomAnnotation useCustomAnnotation = new UseCustomAnnotation();
		useCustomAnnotation.service();
	}

}
