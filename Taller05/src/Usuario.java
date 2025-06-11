import java.util.Collection;
import java.util.TreeSet;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    private Collection incidentes = new TreeSet<>();

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
