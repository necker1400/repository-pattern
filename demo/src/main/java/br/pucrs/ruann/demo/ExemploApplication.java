package br.pucrs.ruann.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages = { "br.pucrs.ruann" })
public class ExemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

}