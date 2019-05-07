package com.example;

public class Estudiante extends Usuario
{   
    private String carrera;

    public Estudiante() 
    {
        super();
        this.carrera="";
    }
    
    public Estudiante(String carrera, String correo, String contraseña, String nombre, String id) 
    {
        super(correo, contraseña, nombre, id);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString() {
        return super.toString()+","+this.carrera;
    }
    
    
    
    
}
