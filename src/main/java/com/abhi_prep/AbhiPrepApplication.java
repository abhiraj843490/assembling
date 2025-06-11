package com.abhi_prep;

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

	public static void main(String[] args) {
		SpringApplication.run(AbhiPrepApplication.class, args);

//		File filePath = new File("C:\\Users\\AbhirajKumar\\Downloads");
//		try {
//			String directoryPath = "C:\\Users\\AbhirajKumar\\Downloads";
//
//			// Using File class create an object for specific directory
//			File directory = new File(directoryPath);
//
//			// Using listFiles method we get all the files of a directory
//			// return type of listFiles is array
//			File[] files = directory.listFiles();
//
//			// Print name of the all files present in that path
//			if (files != null) {
//				for (File file : files) {
//					System.out.println(file.getName());
//				}
//			}
//			Object content = objectMapper.readValue(filePath, Object.class);
//			System.out.println(content);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
