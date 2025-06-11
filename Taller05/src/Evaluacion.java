import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo;

    public Evaluacion(String id, String titulo, LocalDateTime fecha, float maximaCalificacion,int limiteDeTiempo){
        super(titulo, fecha, limiteDeTiempo, id, maximaCalificacion, id);
        this.limiteDeTiempo=limiteDeTiempo;

    }
    
}
