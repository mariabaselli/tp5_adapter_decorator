package Ejercicio4;

public class ConQueso extends ExtraDecorador {

    static final double PRECIO = 140;
    static final String CON_QUESO = "con queso";

    private String descripcion;
    private double precio;


    public ConQueso(Combo combo) {
        super(combo);
        this.descripcion = CON_QUESO;
        this.precio= PRECIO;

    }

    @Override
    public String descripcion() {
        return CON_QUESO;
    }

    @Override
    public double precio() {
        return precio;
    }

}

