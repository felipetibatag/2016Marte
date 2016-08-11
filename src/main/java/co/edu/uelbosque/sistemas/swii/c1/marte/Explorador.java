package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 * Created by felipe on 04/08/2016.
 *      N
 * O----*-----E
 *      S
 */
public class Explorador {
    private String puntoCardinal;
    private String movimiento;

    public Explorador() {
        this.puntoCardinal="N";
    }

    public boolean validaPuntoCardinal() {
        if (puntoCardinal.equalsIgnoreCase("N") || puntoCardinal.equalsIgnoreCase("S")||puntoCardinal.equalsIgnoreCase("E")||puntoCardinal.equalsIgnoreCase("O")) {
            return true;
        }
        return false;
    }

    public boolean validaMovimiento(String movimiento) {
        if (movimiento.equalsIgnoreCase("A") || movimiento.equalsIgnoreCase("I")||movimiento.equalsIgnoreCase("D")) {
            return true;
        }
        return false;
    }

    public void setPuntoCardinal(String puntoCardinal) {
        this.puntoCardinal = puntoCardinal;
    }

    public String getPuntoCardinal() {
        return puntoCardinal;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }


    public String getMovimiento() {
        return movimiento;
    }

    public String movimientoIzquierda() {
        if (puntoCardinal.equalsIgnoreCase("N")) {
            puntoCardinal="O";
            return puntoCardinal;
        }else if (puntoCardinal.equalsIgnoreCase("S")) {
            puntoCardinal="E";
            return puntoCardinal;
        }else if (puntoCardinal.equalsIgnoreCase("E")) {
            puntoCardinal="N";
            return puntoCardinal;
        }else{
            return puntoCardinal="S";
        }
    }

    public String movimientoDerecha() {
        if (puntoCardinal.equalsIgnoreCase("N")) {
            puntoCardinal = "E";
            return puntoCardinal;
        } else if (puntoCardinal.equalsIgnoreCase("E")) {
            puntoCardinal = "S";
            return puntoCardinal;
        } else if (puntoCardinal.equalsIgnoreCase("S")) {
            puntoCardinal = "O";
            return puntoCardinal;
        } else {
            return puntoCardinal = "N";
        }

    }
}