package com.andresparedes.listasclaseunosemanacuatro;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Andres Paredes on 17/02/2018.
 */

public class AdaptadorPersona extends BaseAdapter {

    protected Activity actividad;
    protected ArrayList<Persona> personas;

    public AdaptadorPersona(Activity actividad, ArrayList<Persona> personas){
        this.actividad = actividad;
        this.personas = personas;
    }

    @Override
    public int getCount() {
        return personas.size();
    }

    @Override
    public Object getItem(int i) {
        return personas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

      View v = view;

      if (view == null){
          LayoutInflater inf = (LayoutInflater) actividad.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          v = inf.inflate(R.layout.item_persona,null);
      }

      //Obtengo los datos (nombre, apellido, correo, imagen) desde mi lista
       Persona personaActual = personas.get(i);

        //Obtengo los Tv del XML
        TextView nombre = (TextView) v.findViewById(R.id.tv_persona_nombre);
        TextView apellido = (TextView) v.findViewById(R.id.tv_persona_apellido);
        TextView correo = (TextView) v.findViewById(R.id.tv_persona_correo);

        //Cambio la info por el modelo Persona
        nombre.setText(personaActual.getNombre());
        apellido.setText(personaActual.getApellido());
        correo.setText(personaActual.getCorreo());

        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        img.setImageDrawable(personaActual.getImagen());

        return v;
    }
}
