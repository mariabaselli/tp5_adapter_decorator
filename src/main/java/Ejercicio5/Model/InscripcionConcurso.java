package Ejercicio5.Model;

import java.time.LocalDate;

public interface InscripcionConcurso {

    void inscribirAConFecha(Participante unParticipante, LocalDate fechaInscripcionParticipante,
                            String destinatario, String asunto, String mensaje);
}
