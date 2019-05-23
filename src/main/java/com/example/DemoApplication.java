package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import java.util.ArrayList;

@Controller
@SpringBootApplication
public class DemoApplication 
{
	Single singlen = Single.laConstructora();

  @RequestMapping("/CreaEstudiante")
  @ResponseBody
  String CreaEstudiante(String carrera1, String correo1 ,String contraseña1, String nombre1 , String id1) 
  {
  	String nom = nombre1;
  	String car = carrera1;
  	String cor = correo1;
  	String con = contraseña1;
  	String id = id1;
  	String ret = "";

	singlen.CrearEstudiante(car,cor,con,nom,id);  	
  	
	ret = "El estudiante fue registrado correctamente ";
   
   	return ret; 
  }

  @RequestMapping("/CreaBibliotecario")
  @ResponseBody
  String CreaBibliotecario(String direccion2, String telefono2 ,String correo2, String contraseña2 , String nombre2 , String id2) 
  {
  	String nom = nombre2;
  	String dir = direccion2;
  	String tel = telefono2;
  	String cor = correo2;
  	String con = contraseña2;
  	String id = id2;
  	String ret = "";

	singlen.CrearBibliotecario(dir,tel,cor,con,nom,id);  	
  	
	ret = "El estudiante fue registrado correctamente ";
   
   	return ret; 
  }

  @RequestMapping("/CreaLibro")
  @ResponseBody
  String CreaLibro(String isbn3, String nombre3 ,String descripcion3, String autor3 , String cantidad3 , String paClave3) 
  {
  	String nom = nombre3;
  	String is = isbn3;
  	String des = descripcion3;
  	String au = autor3;
  	String can = cantidad3;
  	String pc = paClave3;
  	String ret = "";

	singlen.CrearLibro(is,nom,des,au,can,pc);  	
  	
	ret = "El estudiante fue registrado correctamente ";
   
   	return ret; 
  }

  @RequestMapping("/CreaReserva")
  @ResponseBody
  String crearReserva(String isbn4, String codigoE4, String fechaRe4 , String numRe4) 
  {
  	String cod = codigoE4;
  	String is = isbn4;
  	String fe = fechaRe4;
  	String nu = numRe4;

  	String ret = "";

	singlen.crearReserva(cod,is,fe,nu);  	
  	
	ret = "El estudiante fue registrado correctamente ";
   
   	return ret; 
  }

  @RequestMapping("/CreaPrestamo")
  @ResponseBody
  String CrearPrestamo(String isbn5, String codigoE5, String fechaEn5 ) 
  {
  	String cod = codigoE5;
  	String is = isbn5;
  	String fe = fechaEn5;

  	String ret = "";

	singlen.crearPrestamo(cod,is,fe);  	
  	
	ret = "El estudiante fue registrado correctamente ";
   
   	return ret; 
  }

  @RequestMapping("/eliminarLibro")
  @ResponseBody
  String eliminarLibro(String isbn6) 
  {

    Single.eliminarLibro(isbn6);

     return "El libro a sido eliminado ";
  }



  @RequestMapping("/InicioEstudiante")
  @ResponseBody
  boolean InicioEstudiante(String correoEstu ,String contraseñaEstu) 
  {
  	boolean si = singlen.inicioEstu(correoEstu,contraseñaEstu);

  	return si;
     
  }

  @RequestMapping("/InicioBibliotecario")
  @ResponseBody
  boolean inicioBiblio(String correoBiblio ,String contraseñaBiblio) 
  {
  	boolean si = singlen.inicioBiblio(correoBiblio,contraseñaBiblio);

  	return si;
     
  }
  
  @RequestMapping("/lok")
  @ResponseBody
  String lok() 
  {

     ArrayList<Estudiante> si = singlen.getEstudiantes();
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/eliminarReserva")
  @ResponseBody
  String eliminarReserva(String numeroReserva) 
  {

    Single.eliminarLibro(numeroReserva);

     return "La reserva a sido eliminada ";
  }

  public static void main(String[] args) 
  {
    SpringApplication.run(DemoApplication.class, args);
  }
}
























