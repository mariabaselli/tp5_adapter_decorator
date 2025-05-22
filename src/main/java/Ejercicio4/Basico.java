package Ejercicio4;

import static java.lang.System.*;
import static java.lang.System.lineSeparator;

public class Basico implements Combo{
    static final String COMBO_BÁSICO = "Combo básico";
    static final int PRECIO = 900;

    private String descripcion;
    private double precio;

    public Basico() {
        this.descripcion = COMBO_BÁSICO;
        this.precio= PRECIO;
    }

    @Override
    public void informarPedido() {
        out.println("[ " + descripcion + " " + precio + " ]");;
    }

}
