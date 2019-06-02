package com.canf.www;



import com.canf.articles.Disc;
import com.canf.articles.Tipus;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {


        ArrayList<String> dis=new ArrayList<>();
        dis.add("primero");
        dis.add("segundo");
        dis.add("tercero");
        Disc disco1=new Disc("1","por la boca vive el pez","discazo",5,Tipus.disco,"fit",dis,"por la boca vive el pez");

        dis.add("primero");
        dis.add("segundo");
        dis.add("tercero");
        Disco disco2=new Disco("2","por la boca vive el pez","discazo",5,TiposArticulos.disco,"fito temazo",dis,"por la boca vive el pez");

        dis.add("primero");
        dis.add("segundo");
        dis.add("tercero");
        Disco disco3=new Disco("3","por la boca vive el pez","discazo",5,TiposArticulos.disco,"fito yuhu",dis,"por la boca vive el pez");

        dis.add("primero");
        dis.add("segundo");
        dis.add("tercero");
        Disco disco4=new Disco("4","por la boca vive el pez","discazo",5,TiposArticulos.disco,"fito",dis,"por la boca vive el pez");

        Almacen almacen = new Almacen(1);
        almacen.cantidad(disco1,5);
        almacen.cantidad(disco2,6);
        almacen.cantidad(disco3,7);
        almacen.cantidad(disco4,8);

        almacen.infoDiscos();


    }
}
