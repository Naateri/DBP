package com.example; //namespace
//Trabajar con sts (Sprint Tool Suite)
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication; //include
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication //anotaciones
@EnableWebMvc //para agregar metadata o cambiar el comportamiento de la clase 
@Controller //que gestione las peticiones del cliente
public class ClaseApplication {
	@RequestMapping("/hello") //cualquiera que le haga una peticion a "/hello"
	//para probar: http://localhost:8080/hello
	void hello(HttpServletResponse response){
		try{
			response.getOutputStream().println("Hola Mundo!");
		} catch (IOException e){
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(ClaseApplication.class, args);
		//String name = "UCSP";
		//System.out.println("Hola mundo! " + name);
	}
}
