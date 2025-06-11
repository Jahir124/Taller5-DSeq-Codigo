import java.util.Collection;
import java.util.TreeSet;

public class PersonalAcademico extends Usuario {
    @SuppressWarnings("rawtypes")
    protected Collection incidentes = new TreeSet<>();

    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido) {
            super(usuario, contraseña, nombre, apellido);
        }
    
    public void reportarError(String email, String contenido){

    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido){

    }

    public void comentar(Foro foro, String comentario){
        
    }
}
