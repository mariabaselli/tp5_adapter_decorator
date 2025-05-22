package Ejercicio4;

import static java.lang.System.*;


public class Familiar implements Combo{
    public static final String COMBO_FAMILIAR = "Combo Familiar";
    public static final int PRECIO = 800;
    private String descripcion;
    private double precio;

    public Familiar () {
        this.descripcion = COMBO_FAMILIAR;
        this.precio= PRECIO;
    }

    @Override
    public void informarPedido() {
        out.println("[ " + descripcion + " " + precio + " ]");;
    }
}
