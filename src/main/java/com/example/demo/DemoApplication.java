package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@lombok.AllArgsConstructor
public class DemoApplication implements CommandLineRunner {

	private final FizzBuzz fizzBuzz;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		for( int n = 1; n < 30; n++ )

			System.out.println( String.format("%n%s : %s", n, fizzBuzz.fizzBuzz(n) ) );


	}
}
