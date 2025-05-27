package Ejercicio3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //String contenido = "contenido del reporte";
        //Report report = new Report(contenido);
        //report.export(new File("C:/Users/Maria/Documents/universidad/2025/Objetos 2/Tp's/reporteEjercicio3.txt"));

        var v = new VerificarSiExiste(new DefaultReporte("otro contenido"));
        v.export(new File("C:/Users/Maria/Documents/universidad/2025/Objetos 2/Tp's/reporteEjercicio3.txt"));
    }
}
