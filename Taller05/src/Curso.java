import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();
    private Profesor responsable;

    public Curso(String id, String nombre, boolean estadoDisponible){
        this.id=id;
        this.nombre=nombre;
        this.estadoDisponible=estadoDisponible;
    }

    public void cursoCreado(List<Estudiante> estudiantesInscritos, Profesor responsable){
        this.estudiantesInscritos = estudiantesInscritos;
        this.responsable = responsable;
    }

    public void cursoEnEspera(List<Estudiante> estudiantesEnEsperaDeInscripcion, Profesor responsable){
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.responsable = responsable;
    }
}
