import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa{
    private LocalDateTime fechaDePublicacion;

    public Tarea(String id, String titulo,LocalDateTime fechaDePublicacion, float max, LocalDateTime fechaDeEntrega){
        super(titulo, fechaDeEntrega, max, id, max, id);
        this.fechaDePublicacion=fechaDePublicacion;

    }

    
    
}
