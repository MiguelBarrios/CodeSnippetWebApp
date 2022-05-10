package com.miguelbarrios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class CodeSnippetAppApplication { 
	
	public static void main(String[] args) {
		SpringApplication.run(CodeSnippetAppApplication.class, args);
	}
}
