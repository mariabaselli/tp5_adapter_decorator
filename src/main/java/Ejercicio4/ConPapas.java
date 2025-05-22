package Ejercicio4;

public class ConPapas extends ExtraDecorador{
    static final int PRECIO = 120;
    static final String CON_PAPAS = "con papas";
    private String descripcion;
    private double precio;

    public ConPapas(Combo combo) {
        super(combo);
        this.descripcion = CON_PAPAS;
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


