/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canf.magatzem;

import com.canf.articles.Article;
import java.util.HashSet;

/**
 *
 * @author miriu
 */
public class Magatzem {
    
    private HashSet<Article> stock;

    public Magatzem(HashSet<Article> stock) {
        this.stock = stock;
    }

    public HashSet<Article> getStock() {
        return stock;
    }
    
    public void cercaArticle() {
        
    }
    
    public void modificarQuantitat() {
        
    }
    
    public void eliminarArticle() {
        
    }
    
    public void vendreArticle() {
        
    }
}
