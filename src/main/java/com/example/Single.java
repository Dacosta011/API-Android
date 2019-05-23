package com.example;

import java.util.ArrayList;

public class Single 
{
    private static Single instancia;
 
  private ArrayList <Estudiante> estudiantes = new ArrayList <Estudiante> ();
  private ArrayList <Bibliotecario> bibliocarios = new ArrayList <Bibliotecario> ();
  private ArrayList <Libro> libros = new ArrayList <Libro> ();
  private ArrayList <Prestamo> prestamos = new ArrayList <Prestamo>();
  private ArrayList <Reserva> reservas = new ArrayList <Reserva>();
  
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

  public void CrearLibro(String isbn , String nom, String des, String aut, String can, String paCla)
  {
    Libro tempo = new Libro(isbn,nom,des,aut,can,paCla);
    libros.add(tempo);
  } 

  public void crearReserva(String isbn, String codigoE, String fechaRe , String numRe)
  {
    Reserva tempo = new Reserva(isbn,codigoE,fechaRe,numRe);
    reservas.add(tempo);

  } 

  public void crearPrestamo(String isbn , String codigoE, String fechaEn)
  {
    Prestamo tempo =  new Prestamo(isbn,codigoE,fechaEn);
    prestamos.add(tempo);

    for(Prestamo prestamo : prestamos)
    {
      if(prestamo.getCodigoEstu().equals(codigoE))
      {
        String is = prestamo.getISBN();
        for(Libro libro : libros)
        {
          if (libro.getISBN().equals(is)) 
          {
            String can = libro.getCantidad();
            int can2 = Integer.parseInt(can);

            int resta = can2-1;

            String resutado = Integer.toString(resta);

            libro.setCantidad(resutado);
          }
        }
      }
    }
  } 

  public ArrayList<Libro> getLibros()
  {
    ArrayList<Libro> lista = new ArrayList<Libro>();
    for(Libro libro : libros)
    {
      lista.add(libro);
    }
    return lista;
  }
  public ArrayList<Reserva> getReservas()
  {
    ArrayList<Reserva> lista = new ArrayList<Reserva>();
    for(Reserva reserva : reservas)
    {
      lista.add(reserva);
    }
    return lista;
  }
  public ArrayList<Estudiante> getEstudiantes()
  {
    ArrayList<Estudiante>lista = new ArrayList<Estudiante>();
    for(Estudiante estudiante : estudiantes)
    {
      lista.add(estudiante);
    }
    return lista;
  }

  public boolean inicioEstu(String correo , String contraseña)
  {
    boolean ok = false;
    for (Estudiante estu : estudiantes) 
    {
      if (estu.getCorreo().equals(correo) && estu.getContraseña().equals(contraseña)) 
      {
        ok = true;  
      }
    }
    return ok;
  }

  public boolean inicioBiblio(String correo , String contraseña)
  {
    boolean ok = false;
    for (Bibliotecario biblio : bibliocarios) 
    {
      if (biblio.getCorreo().equals(correo) && biblio.getContraseña().equals(contraseña)) 
      {
        ok = true;  
      }
    }
    return ok;
  }


  public void eliminarLibro(String isbn)
  {
    ArrayList<Libro> lista = this.getLibros();

    for(Libro libro : lista)
    {
      if (libro.getISBN().equals(isbn)) 
      {
         lista.remove(libro);
      }
    }
  }

  public void eliminarReserva(String numero)
  {
    ArrayList<Reserva> lista = this.getReservas();
    for(Reserva reserva : lista)
    {
      if (reserva.getISBN().equals(isbn)) 
      {
        lista.remove(reserva);
      }
    }

  }

  


}
