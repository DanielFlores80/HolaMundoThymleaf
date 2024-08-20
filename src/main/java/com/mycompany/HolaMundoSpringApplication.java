package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoSpringApplication {

    //Metodo main principal que ejecuta el proyecto, al no haber index o alguna vista puede llegar a mostrar un error
	public static void main(String[] args) {
		SpringApplication.run(HolaMundoSpringApplication.class, args);
	}

}
