package Ejercicio5.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ConcursoDefault implements InscripcionConcurso{
    private ArrayList<Participante> listaInscriptos;
    private RegistroDeInscriptos registroInscriptos;
    private String idConcurso;
    private String nombre;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaFinInscripcion;



    public ConcursoDefault(String idConcurso, String nombre, LocalDate fechaInicioInscripcion,
                           LocalDate fechaFinInscripcion, RegistroDeInscriptos registro) {
        this.idConcurso = idConcurso;
        this.nombre = nombre;
        this.fechaInicioInscripcion = fechaInicioInscripcion;
        this.fechaFinInscripcion = fechaFinInscripcion;
        this.listaInscriptos = new ArrayList<>();
        this.registroInscriptos = registro;

    }

    @Override
    public void inscribirAConFecha(Participante unParticipante, LocalDate fechaInscripcionParticipante, String destinatario, String asunto, String mensaje) {
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
