package Ejercicio4;

public class ConTomate extends ExtraDecorador {

    public static final String CON_TOMATE = " con tomate ";
    public static final double PRECIO = 50;

    private String descripcion;
    private double precio;


    public ConTomate(Combo combo) {
        super(combo);
        this.descripcion = CON_TOMATE;
        this.precio = PRECIO;

    }

    @Override
    public String descripcion() {
        return super.descripcion() + descripcion;
    }

    @Override
    public double precio() {
        return precio + super.precio();
    }
}
