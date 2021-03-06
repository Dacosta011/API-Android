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
  String CreaBibliotecario(String rol, String telefono2 ,String correo2, String contraseña2 , String nombre2 , String id2) 
  {
  	String nom = nombre2;
  	String rol1 = rol;
  	String tel = telefono2;
  	String cor = correo2;
  	String con = contraseña2;
  	String id = id2;
  	String ret = "";

	singlen.CrearBibliotecario(rol1,tel,cor,con,nom,id);  	
  	
	ret = "El Bibliotecario fue registrado correctamente ";
   
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
  	
	ret = "El libro fue registrado correctamente ";
   
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

	String res = singlen.crearPrestamo(cod,is,fe);  	
  	
	ret = "El prestamo fue registrado correctamente ";
   
   	return res; 
  }

  @RequestMapping("/eliminarLibro")
  @ResponseBody
  String eliminarLibro(String isbn6) 
  {
  	singlen.eliminarLibro(isbn6);

  	return "El libro fue eliminado" ; 	
     
  }

  @RequestMapping("/eliminarReserva")
  @ResponseBody
  String eliminarReserva(String numeroReserva) 
  {
  	singlen.eliminarLibro(numeroReserva); 

  	return "La reserva fue eliminada"  ; 	
     
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

     ArrayList<Libro> si = singlen.getLibros();
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/BuscaEstu")
  @ResponseBody
  String BuscaEstu(String codigo) 
  {

     ArrayList<Estudiante> si = singlen.buscaEstu(codigo);
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/BuscaBiblio")
  @ResponseBody
  String BuscaBiblio(String codigo) 
  {

     ArrayList<Bibliotecario> si = singlen.buscaBiblio(codigo);
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/BuscaLibro1")
  @ResponseBody
  String BuscaLibro1(String isbn) 
  {

     ArrayList<Libro> si = singlen.buscaLibro(isbn);
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/BuscaLibro")
  @ResponseBody
  String BuscaLibro(String nombre) 
  {

     ArrayList<Libro> si = singlen.buscaLibroNombre(nombre);
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/BuscaLibro2")
  @ResponseBody
  String BuscaLibro2(String paClave) 
  {

     ArrayList<Libro> si = singlen.buscaLibroPaclave(paClave);
     String datos = si.toString();

     return datos;
   }

  @RequestMapping("/BuscaLibro3")
  @ResponseBody
  String BuscaLibro2(String nombre , String paClave) 
  {

     ArrayList<Libro> si = singlen.buscaLibroPaclave(paClave);
     String datos = si.toString();

     return datos;
   }

  @RequestMapping("/BuscaReserva")
  @ResponseBody
  String BuscaReserva(String numeroRe) 
  {

     ArrayList<Reserva> si = singlen.buscaReserva(numeroRe);
     String datos = si.toString();

     return datos;
  }



  @RequestMapping("/ActualizaEstu")
  @ResponseBody
  String ActualizaEstu(String nombre ,String carrera , String correo , String contraseña) 
  {

     String si = singlen.actualizarEstu(nombre,carrera,correo,contraseña);
     String datos = si.toString();

     return datos;
  }


  @RequestMapping("/ActualizaBiblio")
  @ResponseBody
  String ActualizaBiblio(String nombre, String rol ,String correo ,String contraseña ) 
  {

     String si = singlen.actualizarBiblio(nombre,rol,correo,contraseña);
     String datos = si.toString();

     return datos;
  }


  @RequestMapping("/ActualizaLibro")
  @ResponseBody
  String ActualizaLibro(String isbn, String autor, String paClave, String descripcion , String cantidad) 
  {

     String si = singlen.actualizaLibro(isbn,autor,paClave,descripcion,cantidad);
     String datos = si.toString();

     return datos;
  }

  @RequestMapping("/MostarPrestamos")
  @ResponseBody
  String MostarPrestamos() 
  {

     ArrayList<Prestamo> si = singlen.mostrarPrestamos();
     String datos = si.toString();

     return datos;
  }

  /*@RequestMapping("/ActualizaReserva")
  @ResponseBody
  String ActualizaReserva(String numeroRe) 
  {

     ArrayList<Reserva> si = singlen.buscaReserva(numeroRe);
     String datos = si.toString();

     return datos;
  }*/

  public static void main(String[] args) 
  {
    SpringApplication.run(DemoApplication.class, args);
  }

}
























