package Ejercicio4;

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
    public String descripcion() {
        return descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }
}
