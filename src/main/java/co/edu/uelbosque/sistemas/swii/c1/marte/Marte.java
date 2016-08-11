/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class Marte {

    private int x;
    private int y;
    private int [][]campo;
    private ManejadorArchivo manejadorArchivo;

    public Marte() {
    }

    public Marte(String ruta) throws IOException {
        manejadorArchivo=new ManejadorArchivo();
        manejadorArchivo.setRutaArchivo(ruta);
    }
    public Marte(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;

    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(!(obj instanceof Marte))
            return false;
        Marte t=(Marte)obj;
        if(this.x==t.x && this.y==t.y)
            return true;
        return false;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void inicializaMarte() {

        this.campo=new int[x][y];
    }
}
