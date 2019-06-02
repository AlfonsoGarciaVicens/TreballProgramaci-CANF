/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canf.factura;

import com.canf.articles.Article;
import java.util.Date;

/**
 *
 * @author miriu
 */
public class Factura {

    private Article producte;
    private int quantitarVenuda;
    private Date data;

    public Factura(Article producte, int quantitarVenuda, Date data) {
        this.producte = producte;
        this.quantitarVenuda = quantitarVenuda;
        this.data = data;
    }

    public Article getProducte() {
        return producte;
    }

    public int getQuantitarVenuda() {
        return quantitarVenuda;
    }

    public Date getData() {
        return data;
    }

    public void setQuantitarVenuda(int quantitarVenuda) {
        this.quantitarVenuda = quantitarVenuda;
    }

    @Override
    public String toString() {
        return "Factura{" + "producte=" + producte + ", quantitarVenuda=" + quantitarVenuda + ", data=" + data + '}';
    }

}
