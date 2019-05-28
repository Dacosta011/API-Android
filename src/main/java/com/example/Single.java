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

  public void CrearBibliotecario(String rol, String tel, String cor, String con, String nom, String id)
  {
    Bibliotecario tempo = new Bibliotecario(rol,tel,cor,con,nom,id);
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

  public String crearPrestamo(String isbn , String codigoE, String fechaEn)
  {
    String ret = "";

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
            if (can2 != 0) 
            {
              int resta = can2-1;

              String resutado = Integer.toString(resta);

              libro.setCantidad(resutado);

              ret = "El prestamo del libro se ha realizado correctamente";
            }
            else if (can2 == 0) 
            {
              ret = "Disculpa, no tenemos disponible este libre aún ";
            }
          }
            
        }
          
      }
    }
    return ret; 
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
  public ArrayList<Prestamo> mostrarPrestamos()
  {
    ArrayList<Prestamo>lista=new ArrayList<Prestamo>();

    for(Prestamo prestamo : prestamos)
    {
      for(Estudiante estudiante : estudiantes)
      {
        if(prestamo.getCodigoEstu().equals(estudiante.getId()))
        {
          String a = estudiante.getNombre();

          prestamo.setCodigoEstu(a);
          lista.add(prestamo);
        }
      }
    }

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

  public ArrayList<Bibliotecario> getBibliotecario()
  {
    ArrayList<Bibliotecario>lista = new ArrayList<Bibliotecario>();
    for(Bibliotecario biblio : bibliocarios)
    {
      lista.add(biblio);
    }
    return lista;
  }

  public ArrayList<Estudiante> buscaEstu(String codigo)
  {
    ArrayList<Estudiante>lista = new ArrayList<Estudiante>();
    for(Estudiante estudiante : estudiantes)
    {
      if (codigo.equals(estudiante.getId())) 
      {
        lista.add(estudiante);
      }
    }
    return lista;
  }

  public ArrayList<Bibliotecario> buscaBiblio(String codigo)
  {
    ArrayList<Bibliotecario>lista = new ArrayList<Bibliotecario>();
    for(Bibliotecario bibliotecario : bibliocarios)
    {
      if (codigo.equals(bibliotecario.getId())) 
      {
        lista.add(bibliotecario);
      }
    }
    return lista;
  }
  
  public ArrayList<Libro> buscaLibro(String isbn)
  {
    ArrayList<Libro>lista = new ArrayList<Libro>();
    for(Libro libro : libros)
    {
      if (isbn.equals(libro.getISBN())) 
      {
        lista.add(libro);
      }
    }
    return lista;
  }

  public ArrayList<Libro> buscaLibroNombre(String nombre)
  {
    ArrayList<Libro>lista = new ArrayList<Libro>();
    for(Libro libro : libros)
    {
      if (nombre.equals(libro.getNombre())) 
      {
        lista.add(libro);
      }
    }
    return lista;
  }

  public ArrayList<Libro> buscaLibroPaclave(String paClave)
  {
    ArrayList<Libro>lista = new ArrayList<Libro>();
    for(Libro libro : libros)
    {
      if (paClave.equals(libro.getPalabrasClave()))
      {
        lista.add(libro);
      }
    }
    return lista;
  }

  public ArrayList<Libro> buscaLibroMezcla(String nombre , String paClave)
  {
    ArrayList<Libro>lista = new ArrayList<Libro>();
    for(Libro libro : libros)
    {
      if (paClave.equals(libro.getPalabrasClave()) && nombre.equals(libro.getNombre()))
      {
        lista.add(libro);
      }
    }
    return lista;
  }

  public ArrayList<Reserva> buscaReserva(String numeroRe)
  {
    ArrayList<Reserva>lista = new ArrayList<Reserva>();
    for(Reserva reserva : reservas)
    {
      if (numeroRe.equals(reserva.getNumeroReserva())) 
      {
        lista.add(reserva);
      }
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

  public boolean inicioBiblio(String correo1 , String contraseña1)
  {
    boolean ok = false;
    for (Bibliotecario biblio : bibliocarios) 
    {
      if (biblio.getCorreo().equals(correo1) && biblio.getId().equals(contraseña1)) 
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
      if (reserva.getISBN().equals(numero)) 
      {
        lista.remove(reserva);
      }
    }

  }

  public String actualizarEstu(String nombre ,String carrera ,String correo ,String contraseña)
  {
    String respuesta = "";

    for (Estudiante estu : estudiantes) 
    {
      if (estu.getCorreo().equals(correo) && estu.getContraseña().equals(contraseña) && estu.getNombre().equals(nombre) && estu.getCarrera().equals(carrera)) 
      {
         respuesta = "Tienes que actualizar algun dato... ";
      }
      else if (nombre.equals("") || contraseña.equals("") || nombre.equals("") || carrera.equals(""))
      {
        respuesta = "Porfavor llenar un espacio... ";
      }
      else 
      {
        estu.setNombre(nombre);
        estu.setCarrera(carrera);
        estu.setCorreo(correo);
        estu.setContraseña(contraseña);

        respuesta = "La informacion se actualizo...";
      }
    }



    return respuesta;
  }

  public String actualizarBiblio(String nombre, String rol ,String correo ,String contraseña)
  {
    String respuesta = "";

    for(Bibliotecario biblio : bibliocarios)
    {
      if (biblio.getCorreo().equals(correo) && biblio.getContraseña().equals(contraseña) && biblio.getRol().equals(rol) && biblio.getNombre().equals(nombre)) 
      {
        respuesta = "Tienes que actualizar algun dato... ";
      }
      else 
      {
        biblio.setNombre(nombre);
        biblio.setCorreo(correo);
        biblio.setContraseña(contraseña);
        biblio.setRol(rol);

        respuesta = "La informacion se actualizo correctamente...";
      }
    }


    return respuesta;
  }

  public String actualizaLibro(String isbn, String autor, String paClave, String descripcion , String cantidad) 
  {
    String respuesta = "";

    for(Libro libro : libros)
    {
      if (libro.getISBN().equals(isbn) && libro.getAutor().equals(autor) && libro.getPalabrasClave().equals(paClave) && libro.getDescripcion().equals(descripcion) && libro.getCantidad().equals(cantidad)) 
      {
         respuesta = "Tienes que actualizar algun dato... ";
      }
      else
      {
        libro.setISBN(isbn);
        libro.setAutor(autor);
        libro.setPalabrasClave(paClave);
        libro.setDescripcion(descripcion);
        libro.setCantidad(cantidad);

        respuesta = "La informacion se actualizo...";
      }
    }

    return respuesta;

  }
}