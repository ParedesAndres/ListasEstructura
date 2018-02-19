package com.andresparedes.listasclaseunosemanacuatro;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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

        return null;
    }
}
