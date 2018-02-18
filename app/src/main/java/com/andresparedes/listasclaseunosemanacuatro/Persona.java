package com.andresparedes.listasclaseunosemanacuatro;

import android.graphics.drawable.Drawable;

/**
 * Created by Andres Paredes on 17/02/2018.
 */

public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private Drawable imagen;

    public Persona(){
        super();
    }

    public Persona(String nombre, String apellido, String correo, Drawable imagen){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }
}
