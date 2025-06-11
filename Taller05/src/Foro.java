public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    public Foro(String id, String tematica){
        this.id=id;
        this.tematica=tematica;

    }

    public void agregarComentario(){
        numeroDeComentarios++;
    }
    
}