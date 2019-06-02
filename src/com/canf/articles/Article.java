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
public abstract class Article {

    private int referencia;
    private String nomarticle;
    private double preu;
    private Tipus tipus;

    public Article(int referencia, String nomarticle, double preu, Tipus tipus) {
        this.referencia = referencia;
        this.nomarticle = nomarticle;
        this.preu = preu;
        this.tipus = tipus;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getNomarticle() {
        return nomarticle;
    }

    public double getPreu() {
        return preu;
    }

    public Tipus getTipus() {
        return tipus;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public void setTipus(Tipus tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Article{" + "referencia=" + referencia + ", nomarticle=" + nomarticle + ", preu=" + preu + ", tipus=" + tipus + '}';
    }
    
    public void afegirArticleMagatzem () {
        
    }
    
   

}
