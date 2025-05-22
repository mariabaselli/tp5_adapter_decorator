package Ejercicio4;

public class ConQueso extends ExtraDecorador {

    static final int PRECIO = 140;
    static final String CON_QUESO = "con queso";

    private String descripcion;
    private double precio;


    public ConQueso(Combo combo) {
        super(combo);
        this.descripcion = CON_QUESO;
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

