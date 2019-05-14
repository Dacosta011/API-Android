package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication 
{
	Single singlen = Single.laConstructora();

  @RequestMapping("/")
  @ResponseBody
  String home() 
  {
     return"hola";
  }


  @RequestMapping("/CreaEstudiante")
  @ResponseBody
  String CreaEstudiante(String car, String cor ,String con, String nom , String id) 
  {
  	String nombre = nom;
  	String carrera = car;

  	return "ESTUDIANTE: "+ nombre + " DE LA CARRERA: "+carrera;
     //singlen.CrearEstudiante(car,cor,con,nom,id);
  }

  @RequestMapping("/hello")
  @ResponseBody
  String hello() {
    return "Hello from Heroku!";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
