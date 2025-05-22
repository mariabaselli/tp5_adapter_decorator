package Ejercicio1;

public abstract class Motor {

    public static final String ARRANCAR = "Arrancando el motor";
    public static final String ACELERAR = "Acelerando el motor";
    public static final String APAGAR = "Apagando el motor";

    public String arrancar() {
        return ARRANCAR;
    }
    public String acelerar() {
        return ACELERAR;
    }

    public String apagar() {
        return APAGAR;
    }
}
