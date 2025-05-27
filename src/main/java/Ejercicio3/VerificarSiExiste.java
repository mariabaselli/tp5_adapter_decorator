package Ejercicio3;

import java.io.File;

public class VerificarSiExiste implements Reporte{
    //El decorador implementa y compone a la clase base
    private Reporte reporte;

    public VerificarSiExiste(Reporte reporte) {
        this.reporte = reporte;
    }

    //El decorador delega en quien compone y agrega comportamiento (no importa el orden)
    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        this.reporte.export(file);
    }
}



