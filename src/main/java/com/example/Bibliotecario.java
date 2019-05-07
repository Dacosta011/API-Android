package com.example;


public class Bibliotecario extends Usuario 
{
    private String direccion ;
    private String telefono;

    public Bibliotecario() 
    {
        super();
        this.direccion="";
        this.telefono="";
    }

    public Bibliotecario(String direccion, String telefono, String correo, String contraseña, String nombre, String id) {
        super(correo, contraseña, nombre, id);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+","+ direccion + "," + telefono;
    }
    
    
    
    
}
