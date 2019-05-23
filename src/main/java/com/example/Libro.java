package com.example;
public class Libro 
{
    private String ISBN;
    private String nombre;
    private String descripcion;
    private String autor;
    private String cantidad;
    private String palabrasClave;

    public Libro() 
    {
        this.ISBN="";
        this.nombre="";
        this.autor="";
        this.descripcion="";
        this.palabrasClave="";
        this.cantidad="";
        
    }

    public Libro(String ISBN, String nombre, String descripcion, String autor, String cantidad, String palabrasClave) 
    {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.autor = autor;
        this.cantidad = cantidad;
        this.palabrasClave = palabrasClave;
    }

    

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombw() {
        return nombre;
    }

    public void setNombw(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
    public String toString() {
        return ISBN + ", " + nombre + ", " + descripcion + ", " + autor + ", " + cantidad + ", " + palabrasClave ;
    }

}

