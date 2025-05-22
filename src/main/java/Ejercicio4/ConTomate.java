package Ejercicio4;

public class ConTomate extends ExtraDecorador{

    public static final String CON_TOMATE = "con tomate";
    public static final int PRECIO = 50;

    private String descripcion;
    private double precio;
    private Combo combo;

    public ConTomate(Combo combo) {
        super(combo);
        this.descripcion = CON_TOMATE;
        this.precio= PRECIO;

    }

    @Override
    protected double informarPrecio() {
        return this.precio;
    }

    @Override
    protected String informarDescripcion() {
        return this.descripcion;
    }
}
