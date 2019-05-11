package com.example;

import java.util.ArrayList;

public class Single 
{
    private static Single instancia;
 
  private ArrayList <Estudiante> estudiantes = new ArrayList <Estudiante> ();
  private ArrayList <Bibliotecario> bibliocarios = new ArrayList <Bibliotecario> ();
  
  public static Single laConstructora() 

  {

    if(instancia==null)
    {
      instancia= new Single();
    }

    return instancia;
      
  }

  public void CrearEstudiante(String car, String cor, String con, String nom, String id)
  {
    Estudiante tempo = new Estudiante(car,cor,con,nom,id);
    estudiantes.add(tempo);
  }

  public void CrearBibliotecario(String dir, String tel, String cor, String con, String nom, String id)
  {
    Bibliotecario tempo = new Bibliotecario(dir,tel,cor,con,nom,id);
    bibliocarios.add(tempo);
  }

  public int suma(String uno , String dos )
  {
    int tres;
    tres = Integer.parseInt(uno) +Integer.parseInt(dos) ;

    return tres;
  }

}
