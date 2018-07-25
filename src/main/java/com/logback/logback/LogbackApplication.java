package com.logback.logback;

import com.logback.logback.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackApplication {

	@Autowired
	private Servicio servicio;



	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
	}

	public void run(final String args[]){
		servicio.doStuff("Valor mensaje");
	}
}
