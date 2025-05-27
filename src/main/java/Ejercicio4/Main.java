package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        ConCarne combo = new ConCarne(new Basico());
        combo.descripcion();

        ConPapas comboPapasTomate = new ConPapas(new ConTomate(new Familiar()));
        System.out.println(comboPapasTomate.descripcion());
        System.out.println(comboPapasTomate.precio());

        var builder = new Builder (new Basico());
        var combo2 = builder.conTomate().conPapas().build();
        System.out.println(combo2.descripcion());
        System.out.println(combo2.precio());

    }
}
