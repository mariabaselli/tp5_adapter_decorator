package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

//Crea el string de reporte y lo sobreesctibe

public class DefaultReporte implements Reporte{

    private String reporte;
    public DefaultReporte(String reporte) {
        this.reporte = reporte;
    }
    @Override
    public void export(File file) {
        // Exportar el reporte a un archivo.
        try{
            Files.write(
                    file.toPath(),
                    reporte.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,//Crea el archivo si no existe
                    StandardOpenOption.TRUNCATE_EXISTING  //Sobreescribe el contenido si no existe
            );
        } catch (IOException e) {
            throw new RuntimeException("Error al exportar", e);
        }


    }
}
