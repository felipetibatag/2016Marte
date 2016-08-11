/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ManejadorArchivo {

    private File reglas;
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<String> lineas;



    public void setRutaArchivo(String ruta) throws IOException {
        String linea=null;
        lineas=new ArrayList<String>();
        reglas=new File(ruta);
        if((!reglas.exists())) {
            throw new FileNotFoundException("El Archivo de Reglas No Existe");
        }else {
            this.fr = new FileReader(reglas);
            this.br=new BufferedReader(fr);
            while((linea=br.readLine())!=null){
                this.lineas.add(linea);
            }
        }

    }

    public String getPrimeraLinea() throws IOException {
        return lineas.get(0);
    }


    public String getSegundaLinea() throws IOException {
        return lineas.get(1);
    }

    public String extraeCaracter() throws IOException {
        return lineas.get(0).substring(0,1);
    }
}