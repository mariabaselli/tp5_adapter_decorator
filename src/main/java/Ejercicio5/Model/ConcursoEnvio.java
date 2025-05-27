package Ejercicio5.Model;

import java.time.LocalDate;

public class ConcursoEnvio implements InscripcionConcurso{
    private InscripcionConcurso inscripcion;
    private NotificarRegistro notificador;
    public ConcursoEnvio(InscripcionConcurso inscripcion, NotificarRegistro notificador) {
        this.inscripcion = inscripcion;
        this.notificador=notificador;
    }

    @Override
    public void inscribirAConFecha(Participante unParticipante, LocalDate fechaInscripcionParticipante, String destinatario, String asunto, String mensaje) {
       this.notificador.enviarMensaje(destinatario, asunto, mensaje);
        inscripcion.inscribirAConFecha(unParticipante, fechaInscripcionParticipante, destinatario, asunto, mensaje);
    }
}
