import Ejercicio5.Model.ConcursoDefault;
import Ejercicio5.Model.ConcursoEnvio;
import Ejercicio5.Model.Participante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConcursoTest {

    private Participante jose;
    private LocalDate fechaInscripcionParticipante;
    private LocalDate fechaInicioConcurso;
    private LocalDate fechaFinConcurso;
    private String destinatario;
    private String asunto;
    private String mensaje;
    private FakeCorreoElectronico fakeCorreoElectronico;
    private FakeRegistroInscriptos fakeRegistroInscriptos;


    @BeforeEach
    public void inicializarVariables() {
        this.jose = Participante.nuevoParticipante("joseperez01", "Jose Perez");
        this.fechaInicioConcurso = LocalDate.now();
        this.fechaFinConcurso = LocalDate.now().plusDays(60);
        this.fechaInscripcionParticipante = LocalDate.now().plusDays(5);
        this.fakeCorreoElectronico = new FakeCorreoElectronico();
        this.fakeRegistroInscriptos = new FakeRegistroInscriptos();
        this.destinatario = "destinatarioprueba@prueba.com";
        this.asunto = "Confirmación inscripción";
        this.mensaje = "Hola, te has inscripto al concurso";

    }

    @Test
    public void verificarEmailConcursoDecorado() {
        ConcursoDefault concurso = new ConcursoDefault("01a", "Un Concurso",
                fechaInicioConcurso, fechaFinConcurso, fakeRegistroInscriptos);
        var concursoDecorado = new ConcursoEnvio(concurso, fakeCorreoElectronico);
        concursoDecorado.inscribirAConFecha(jose,LocalDate.now().plusDays(5), "destinatarioprueba@prueba.com",
                "Confirmación inscripción", "Hola, te has inscripto al concurso");
        assertEquals(destinatario + asunto + mensaje, fakeCorreoElectronico.obtenerDatosEmail());
    }
}