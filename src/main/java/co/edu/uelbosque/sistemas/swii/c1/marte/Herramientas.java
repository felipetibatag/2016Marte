package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 * Created by felipe on 03/08/2016.
 */
public class Herramientas {
    public static boolean validaNumerosPositivos(String cadena) {
        try {
            Math.abs(Integer.parseInt(cadena));
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
