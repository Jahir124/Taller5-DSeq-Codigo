import java.util.ArrayList;
import java.util.List;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    private List<Incidente> incidentes = new ArrayList();

    public Usuario(String usuario, String contraseña, String nombre, String apellido){
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    protected boolean login(){

    }

    protected boolean logOut(){

    }
}
