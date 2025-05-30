package Ejercicio5.Model;



import Ejercicio3.DefaultReporte;
import Ejercicio3.VerificarSiExiste;
import Ejercicio5.persistencia.ArchivoDeInscriptos;
import Ejercicio5.persistencia.CorreoElectronico;

import java.io.File;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Participante jose = Participante.nuevoParticipante("joseperez01", "Jose Perez");

        ArchivoDeInscriptos archivo = new ArchivoDeInscriptos("C:\\Users\\Maria\\Documents\\universidad\\2025\\Objetos 2\\Tp's\\Tp2 registroInscriptos.txt");
        var concursoSinEnvio = new ConcursoDefault("01a", "Un Concurso",
                LocalDate.now(), LocalDate.now().plusDays(60), archivo);
        concursoSinEnvio.inscribirAConFecha(jose,LocalDate.now().plusDays(5), "prueba@prueba.com",
                "Inscripción Concurso", "Hola, te has inscripto al concurso");


        var v = new ConcursoEnvio(new ConcursoDefault("01a", "Un Concurso",
                LocalDate.now(), LocalDate.now().plusDays(60),
                archivo), new CorreoElectronico("prueba@gmail.com"){
        });

        v.inscribirAConFecha(jose,LocalDate.now().plusDays(5), "prueba@prueba.com",
                "Inscripción Concurso", "Hola, te has inscripto al concurso");


    }

    }

