package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("abc");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		GreatLearning greatLearning = new GreatLearning ();
		System.out.println(" Course name" + greatLearning );
	}

}
