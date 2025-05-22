package Ejercicio4;

public class ConCarne extends ExtraDecorador {

    private static final int PRECIO = 140;
    private static final String CON_CARNE = "con carne";

    private String descripcion;
    private double precio;

    public ConCarne(Combo combo) {
        super(combo);
        this.descripcion = CON_CARNE;
        this.precio = PRECIO;
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
