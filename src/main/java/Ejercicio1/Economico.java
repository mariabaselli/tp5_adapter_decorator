package Ejercicio1;

public class Economico extends Motor{

    public static final String TIPO_MOTOR = " economico";

    @Override
    public String arrancar() {
        return super.arrancar() + TIPO_MOTOR;
    }

    @Override
    public String acelerar() {
        return super.acelerar() + TIPO_MOTOR;
    }

    @Override
    public String apagar() {
        return super.apagar() + TIPO_MOTOR;
    }
}
