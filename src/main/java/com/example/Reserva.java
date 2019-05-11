package com.example;
public class Reserva
{
    private String ISBN;
    private String codigoEstu;
    private String fechaRecoge;

    public Reserva() 
    {
        this.ISBN="";
        this.codigoEstu="";
        this.fechaRecoge="";
    }

    public Reserva(String ISBN, String codigoEstu, String fechaRecoge) 
    {
        this.ISBN = ISBN;
        this.codigoEstu = codigoEstu;
        this.fechaRecoge = fechaRecoge;
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

    public String getFechaRecoge() {
        return fechaRecoge;
    }

    public void setFechaRecoge(String fechaRecoge) {
        this.fechaRecoge = fechaRecoge;
    }

    @Override
    public String toString() {
        return ISBN + ", "+ codigoEstu + ", " + fechaRecoge;
    }
    
    
}
