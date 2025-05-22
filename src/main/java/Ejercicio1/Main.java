package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Economico economico = new Economico ();
        Electrico electrico = new Electrico();
        MotorAdapter adaptadorMotor = new MotorAdapter(electrico);

        System.out.println(adaptadorMotor.acelerar());
        System.out.println(economico.acelerar());
    }
}