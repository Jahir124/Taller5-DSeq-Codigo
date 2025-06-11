import java.util.ArrayList;
import java.util.List;

public class Estudiante extends PersonalAcademico{

    private List<Curso> cursosInscritos = new ArrayList();
    private List<Curso> cursosEnEspera = new ArrayList();

    public Estudiante(String usuario, String contraseña, String nombre, String apellido) {
            super(usuario, contraseña, nombre, apellido);
        }
        
    public void solicitaInscripcionCurso(Curso curso){
        //LOGICA
    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //LOGICA
    }
}