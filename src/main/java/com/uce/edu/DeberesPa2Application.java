package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeberesPa2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DeberesPa2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("<<<<<NUEVO PROYECTO>>>>>");
		System.out.println("CAMBIO PARA SUBIR EN LA MISMA RAMA ");
		System.out.println("CAMBIO PARA SUBIR EN OTRA RAMA");
		
	}

}
