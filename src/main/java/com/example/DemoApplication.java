package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication 
{
	Single singlen = Single.laConstructora();

  @RequestMapping("/")
  @ResponseBody
  String home() 
  {
     return"hola";
  }


  @RequestMapping("/CreaEstudiante")
  @ResponseBody
  String CreaEstudiante(String carrera, String correo ,String contraseña, String nombre , String id) 
  {
  	String nom = nombre;
  	String car = carrera;

  	return "ESTUDIANTE: "+ nombre + " DE LA CARRERA: "+carrera;
     //singlen.CrearEstudiante(car,cor,con,nom,id);
  }

  @RequestMapping("/hello")
  @ResponseBody
  String hello() {
    return "Hello from Heroku!";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}

























/*Call<ResponseBody> call = service.CreaEstudiante(car, cor, con, nom, id);

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> _call,
                                           Response<ResponseBody> response) {
                        try {
                            String resp = response.body().string();
                            Toast.makeText(RegistroEstudiante.this,"Toast desde Servlet ->"+resp, Toast.LENGTH_SHORT).show();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }


                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Toast.makeText(RegistroEstudiante.this, "Error :( ",Toast.LENGTH_SHORT).show();
                    }
                });*/