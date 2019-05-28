/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canf.articles;

/**
 *
 * @author miriu
 */
public class Llibre extends Article {

    private String nomAutor;
    private int nroPagines;
    private String editorial;
    private int ISBN;

    public Llibre(int referencia, String nomarticle, double preu, Tipus tipus) {
        super(referencia, nomarticle, preu, tipus);
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public int getNroPagines() {
        return nroPagines;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Llibre{" + "nomAutor=" + nomAutor + ", nroPagines=" + nroPagines + ", editorial=" + editorial + ", ISBN=" + ISBN + '}';
    }

}
