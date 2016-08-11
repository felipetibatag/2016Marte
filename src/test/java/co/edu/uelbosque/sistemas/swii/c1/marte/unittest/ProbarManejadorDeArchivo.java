/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandro
 */
public class ProbarManejadorDeArchivo {


    public ProbarManejadorDeArchivo() {

    }

    @Test(expectedExceptions = FileNotFoundException.class)
    public void elArchivoNoExiste() throws IOException {
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("reglas.txt");
    }
    
    @Test
    public void elArchivoExiste() throws IOException {
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
    }
    
    @Test
    public void laPrimerLineaDelArchivoEsCorrecta() throws FileNotFoundException, IOException{
        String texperado="7 6";
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String t=manejador.getPrimeraLinea();
        Assert.assertTrue(texperado.equals(t));
    }
    
    @Test
    public void laLineDeCoordenadasEsCorrecta() throws FileNotFoundException, IOException{
        String texperado="1 7 N";
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String t=manejador.getSegundaLinea();
        Assert.assertTrue(texperado.equals(t));
    }

    @Test
    public void extraeUnElementoDeUnaCadena() throws IOException {
        String esperada="7";
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        String t=manejador.extraeCaracter();
        Assert.assertTrue(esperada.equals(t));
    }

    @Test
    public void validaSiEsNumeroPositivo(){
        Assert.assertTrue(Herramientas.validaNumerosPositivos("1"));
    }
    @Test
    public void esUnPuntoCardinalValido(){
        Explorador explorador=new Explorador();
        explorador.setPuntoCardinal("N");
        Assert.assertTrue(explorador.validaPuntoCardinal());
    }

    @Test
    public void esUnMovimientoValido(){
        String movimiento="D";
        Explorador explorador=new Explorador();
        Assert.assertTrue(explorador.validaMovimiento(movimiento));
    }
    @Test
    public void realizaMovimientoIzquierdaDesdeNorte(){
        String puntoCardinalEsperado="O";
        Explorador explorador=new Explorador();
        //explorador.setPuntoCardinal("O");
        Assert.assertTrue(puntoCardinalEsperado.equalsIgnoreCase(explorador.movimientoIzquierda()));
    }
    @Test
    public void realizaMovimientoIzquierdaDesdeEste(){
        String puntoCardinalEsperado="N";
        Explorador explorador=new Explorador();
        explorador.setPuntoCardinal("E");
        Assert.assertTrue(puntoCardinalEsperado.equalsIgnoreCase(explorador.movimientoIzquierda()));
    }


    @Test
    public void realizarMovimientoDerechaDesdeSur(){
        String puntoCardinalEsperado="O";
        Explorador explorador=new Explorador();
        explorador.setPuntoCardinal("S");
        Assert.assertTrue(puntoCardinalEsperado.equalsIgnoreCase(explorador.movimientoDerecha()));
    }

    @Test
    public void creaMarte7x6(){
        Marte marte=new Marte();
        marte.setX(7);
        marte.setY(6);
        marte.inicializaMarte();
    }

  /**  @Test
    public void creaMarte7x6DesdeArchivo() throws IOException {
       Marte marte=new Marte("src/main/resources/reglas.txt");
        marte.inicializaMarte();
    }
  **/

}