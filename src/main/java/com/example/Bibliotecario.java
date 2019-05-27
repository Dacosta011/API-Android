package com.example;


public class Bibliotecario extends Usuario 
{
    private String rol ;
    private String telefono;

    public Bibliotecario() 
    {
        super();
        this.rol="";
        this.telefono="";
    }

    public Bibliotecario(String rol, String telefono, String correo, String contraseña, String nombre, String id) {
        super(correo, contraseña, nombre, id);
        this.rol = rol;
        this.telefono = telefono;
    }

    public String getRol() {
        return direccion;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString()+","+ rol + "," + telefono;
    }
    
    
    
    
}
