public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;
    private Curso curso;

    public Foro(String id, String tematica){
        this.id=id;
        this.tematica=tematica;

    }

    public void agregarComentario(){
        numeroDeComentarios++;
    }
    
}