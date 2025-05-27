package Ejercicio4;

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
    public String descripcion() {
        return descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }
}
