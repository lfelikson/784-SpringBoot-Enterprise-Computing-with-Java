package com.gfg.Spring.Boot.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;
/* 
@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
*/


@SpringBootApplication
// Main class
// Implementing CommandLineRunner interface
public class SpringBootAppApplication implements CommandLineRunner 
{

	// Method 1
	// run() method for springBootApplication to execute
	@Override
	public void run(String args[]) throws Exception 
	{

		// Print statement when method is called
		System.out.println("HELLO WORLD !!!!!!!!");
	}

	// Method 2
	// Main driver method
	public static void main(String[] args) 
	{

		// Calling run() method to execute SpringBootApplication by
		// invoking run() inside main() method
		SpringApplication.run(SpringBootAppApplication .class, args);
	}
}

