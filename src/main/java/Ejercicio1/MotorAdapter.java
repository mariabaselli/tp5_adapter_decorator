package Ejercicio1;

public class MotorAdapter extends Motor {
    private Electrico motorElectrico;

    public MotorAdapter(Electrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String arrancar() {
        motorElectrico.conectar();
        return super.arrancar() + motorElectrico.activar();
    }

    @Override
    public String acelerar() {
        return super.acelerar()+ motorElectrico.moverMasRapido();
    }

    @Override
    public String apagar() {
        motorElectrico.detener();
        return super.apagar() + motorElectrico.desconectar();
    }
}
