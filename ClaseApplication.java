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
			Integer i = 0;
			String name = request.getParameter("name"); //user input
			String html = "<html><i style = 'color: red'>Hola " + i + "Mundo!\n </i></html>"; //test
			response.setHeader("Content-Type", "html"); //headers
			while(true){
				response.getOutputStream().println(html);
				i+=1;
			}
		} catch (IOException e){
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(ClaseApplication.class, args);
		//String name = "UCSP";
		//System.out.println("Hola mundo! " + name);
	}
}
