package Ejercicio4;

public abstract class ExtraDecorador implements Combo {
    private Combo combo;

    public ExtraDecorador(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return combo.descripcion();
    }



    @Override
    public double precio() {
        return combo.precio();
    }


}
