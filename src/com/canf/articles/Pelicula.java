/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canf.articles;

import java.util.ArrayList;

/**
 *
 * @author miriu
 */
public class Pelicula extends Article {

    private ArrayList<String> llistaActors;
    private String nomDirector;
    private String sinopsi;

    public Pelicula(int referencia, String nomarticle, double preu, Tipus tipus) {
        super(referencia, nomarticle, preu, tipus);
    }

    public ArrayList<String> getLlistaActors() {
        return llistaActors;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public String getSinopsi() {
        return sinopsi;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "llistaActors=" + llistaActors + ", nomDirector=" + nomDirector + ", sinopsi=" + sinopsi + '}';
    }

}
