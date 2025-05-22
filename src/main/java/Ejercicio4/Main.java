package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        ConCarne combo = new ConCarne(new Basico());
        combo.informarPedido();

        ConPapas comboPapasTomate = new ConPapas(new ConTomate(new Familiar()));
        comboPapasTomate.informarPedido();
    }
}
