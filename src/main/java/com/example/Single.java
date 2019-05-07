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

}
