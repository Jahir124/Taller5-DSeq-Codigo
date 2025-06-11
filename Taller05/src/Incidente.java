import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;

    protected PersonalAcademico beneficiario;
}
