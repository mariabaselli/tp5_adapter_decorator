package Ejercicio5.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ConcursoDefault implements InscripcionConcurso{
    public static final String ERROR_FECHAS_CONCURSO = "La fecha de finalización no puede ser anterior a la fecha de inicio del concurso.";
    public static final String ERROR_NOMBRE_CONCURSO = "El nombre proporcionado no es válido. Ingrese un nombre correcto.";
    public static final String ERROR_PARTICIPANTE_YA_INSCRIPTO = "El participante ya fue inscripto.";
    public static final String ERROR_FECHA_INSCRIPCION = "La inscripción al concurso ya cerró";
    public static final String ERROR_ID_CONCURSO = "No es correcto el ID para identificar al concurso";

    private ArrayList<Participante> listaInscriptos;
    private RegistroDeInscriptos registroInscriptos;
    private String idConcurso;
    private String nombre;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaFinInscripcion;



    public ConcursoDefault(String idConcurso, String nombre, LocalDate fechaInicioInscripcion,
                           LocalDate fechaFinInscripcion, RegistroDeInscriptos registro) {
        assertStringEsValido(nombre, ERROR_NOMBRE_CONCURSO);
        assertStringEsValido(idConcurso, ERROR_ID_CONCURSO);
        assertFechaValida(fechaInicioInscripcion, fechaFinInscripcion);

        this.idConcurso = idConcurso;
        this.nombre = nombre;
        this.fechaInicioInscripcion = fechaInicioInscripcion;
        this.fechaFinInscripcion = fechaFinInscripcion;
        this.listaInscriptos = new ArrayList<>();
        this.registroInscriptos = registro;

    }

    private static void assertFechaValida(LocalDate fechaInicioInscripcion, LocalDate fechaFinInscripcion) {
        if (fechaInicioInscripcion.isAfter(fechaFinInscripcion) || fechaFinInscripcion.isBefore(fechaInicioInscripcion)) {
            throw new IllegalArgumentException(ERROR_FECHAS_CONCURSO);
        }
    }

    private static void assertStringEsValido(String datoDelConcurso, String unMensajeException) {
        if (datoDelConcurso.isBlank() || datoDelConcurso == null) {
            throw new IllegalArgumentException(unMensajeException);
        }
    }



    private void validarInscripcion(LocalDate fechaInscripcionParticipante, Participante unParticipante) {

        if (!esValidaInscripcion(fechaInscripcionParticipante)) {
            throw new RuntimeException(ERROR_FECHA_INSCRIPCION);
        }
        if (estaInscripto(unParticipante)) {
            throw new RuntimeException(ERROR_PARTICIPANTE_YA_INSCRIPTO);
        }
    }

    private boolean esValidaInscripcion(LocalDate unaFecha) {
        return (entreInicioFin(unaFecha) || esIgual(unaFecha));
    }

    private boolean entreInicioFin(LocalDate unaFecha) {
        return unaFecha.isAfter(fechaInicioInscripcion) && unaFecha.isBefore(fechaFinInscripcion);
    }

    private boolean esIgual(LocalDate unaFecha) {
        return unaFecha.equals(this.fechaInicioInscripcion);
    }

    public boolean estaInscripto(Participante unParticipante) {
        return listaInscriptos.contains(unParticipante);
    }

    public int cantidadInscriptos() {
        return this.listaInscriptos.size();
    }

    @Override
    public void inscribirAConFecha(Participante unParticipante, LocalDate fechaInscripcionParticipante, String destinatario, String asunto, String mensaje) {
      validarInscripcion(fechaInscripcionParticipante,unParticipante);
        this.listaInscriptos.add(unParticipante);
        if (inscribirPrimerDia(fechaInscripcionParticipante)) {
            unParticipante.sumarPuntos(10);
        }
        this.registroInscriptos.registrarInscripto(fechaInscripcionParticipante, unParticipante.obtenerId(), idConcurso);

    }

    public boolean inscribirPrimerDia(LocalDate fechaInscripcionParticipante) {
        return (fechaInicioInscripcion.equals(fechaInscripcionParticipante));
    }


}
