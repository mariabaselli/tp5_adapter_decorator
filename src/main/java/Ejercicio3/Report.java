package Ejercicio3;

import java.io.File;


public class Report {
    private String reporte;
    public Report(String reporte) {
        this.reporte = reporte;
    }

    void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }


    }
}
