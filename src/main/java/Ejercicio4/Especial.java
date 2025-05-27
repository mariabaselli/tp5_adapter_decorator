package Ejercicio4;

import static java.lang.System.*;
import static java.lang.System.lineSeparator;

public class Especial implements Combo {
    public static final String COMBO_ESPECIAL = "Combo especial";
    public static final int PRECIO = 1200;
    private String descripcion;
    private double precio;


    public Especial() {
        this.descripcion = COMBO_ESPECIAL;
        this.precio = PRECIO;
    }


    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }
}
