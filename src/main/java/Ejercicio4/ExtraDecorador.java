package Ejercicio4;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public abstract class ExtraDecorador implements Combo {
    private Combo combo;

    public ExtraDecorador(Combo combo) {
        this.combo = combo;
    }

    @Override
    public final void informarPedido() {
        this.combo.informarPedido();
        out.print("[ " + informarDescripcion() + " " + informarPrecio() + " ]" + lineSeparator());;

    }

    protected abstract double informarPrecio() ;

    protected abstract String informarDescripcion();
}
