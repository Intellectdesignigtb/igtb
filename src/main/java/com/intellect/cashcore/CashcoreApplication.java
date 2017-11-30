package com.intellect.cashcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CashcoreApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(CashcoreApplication.class, args);
	}
@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(CashcoreApplication.class);
  }
}
