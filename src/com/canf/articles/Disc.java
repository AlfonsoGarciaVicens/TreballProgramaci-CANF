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
public class Disc extends Article {

    private String intepret;
    private ArrayList<String> cançons;
    private String nomDiscografica;

    public Disc(int referencia, String nomarticle, double preu, Tipus tipus) {
        super(referencia, nomarticle, preu, tipus);
<<<<<<< HEAD
        System.out.println("Hola");
=======
>>>>>>> origin/master
    }

    public String getIntepret() {
        return intepret;
    }

    public ArrayList<String> getCançons() {
        return cançons;
    }

    public String getNomDiscografica() {
        return nomDiscografica;
    }

    @Override
    public String toString() {
        return "Disc{" + "intepret=" + intepret + ", can\u00e7ons=" + cançons + ", nomDiscografica=" + nomDiscografica + '}';
    }

}
