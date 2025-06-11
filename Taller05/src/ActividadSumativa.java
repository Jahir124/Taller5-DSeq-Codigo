import java.time.LocalDateTime;

public abstract class ActividadSumativa {
    protected String titulo;
    protected LocalDateTime fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public ActividadSumativa(String titulo,LocalDateTime fechaDeEntrega,float puntajeMaximo,String contenido, float calificacion,String id){
        this.titulo=titulo;
        this.fechaDeEntrega=fechaDeEntrega;
        this.puntajeMaximo=puntajeMaximo;
        this.contenido=contenido;
        this.calificacion=calificacion;
        this.id=id;

    }
    
    
    
}
