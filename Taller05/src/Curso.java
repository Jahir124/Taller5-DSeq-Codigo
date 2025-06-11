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

    public void addEstudiantesInscritos(Estudiante estudiante){
        estudiantesInscritos.add(estudiante);

    }
    public void addEstudiantesEnEsperaDeInscripcion(Estudiante e2Estudiante){
        estudiantesEnEsperaDeInscripcion.add(e2Estudiante);
    }
    
    public void addactividadesSumativas(ActividadSumativa act){
        actividadesSumativas.add(act);
    }
    
    public void addForos(Foro foro){
        foros.add(foro);
    }

    public void setProfResponsable(Profesor responsable){
        this.responsable=responsable;
    }
}
