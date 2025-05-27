package Ejercicio4;

public class ConPapas extends ExtraDecorador{
    static final double PRECIO = 120;
    static final String CON_PAPAS = " con papas ";

    private String descripcion;
    private double precio;

    public ConPapas(Combo combo) {
        super(combo);
        this.descripcion = CON_PAPAS;
        this.precio= PRECIO;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + descripcion ;
    }

    @Override
    public double precio() {
        return precio + super.precio();
    }

}


