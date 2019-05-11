package com.example;
public class Prestamo 
{
    private String ISBN;
    private String codigoEstu;
    private String fechaRegreso;

    public Prestamo() 
    {
        this.ISBN="";
        this.codigoEstu="";
        this.fechaRegreso="";
    }

    public Prestamo(String ISBN, String codigoEstu, String fechaRegreso) 
    {
        this.ISBN = ISBN;
        this.codigoEstu = codigoEstu;
        this.fechaRegreso = fechaRegreso;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCodigoEstu() {
        return codigoEstu;
    }

    public void setCodigoEstu(String codigoEstu) {
        this.codigoEstu = codigoEstu;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRecoge(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    @Override
    public String toString() {
        return ISBN + ", "+ codigoEstu + ", " + fechaRegreso;
    }
}
