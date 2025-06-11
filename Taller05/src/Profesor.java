import java.util.Collection;
import java.util.TreeSet;

public class Profesor extends PersonalAcademico{

    @SuppressWarnings("rawtypes")
    private Collection cursosACargo = new TreeSet<>();

    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
            super(usuario, contraseña, nombre, apellido);
        }
    
    public void cargarActividadSumativa (Curso curso, ActividadSumativa actividadSumativa){
        //LOGICA
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        //LOGICA
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //LOGICA
    }

    public void crearNuevoForo(Foro foro){
        //LOGICA
    }
}
