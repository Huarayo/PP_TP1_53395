
import java.util.List;
import java.util.ArrayList;

public abstract class Actividad{
    private int id;
    private String titulo;
    private int cupoMaximo;
    static final int CUPO_MINIMO = 5;
    
    public List<Inscripcion> inscripciones;
    
    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>(); //inicializar lista vacia
    }
    
   
    
    public Inscripcion inscribir(Estudiante estudiante) {
        Inscripcion inscripcion = new Inscripcion(estudiante, this);
        inscripciones.add(inscripcion);
        System.out.printf("nombre: " + estudiante.getNombre() + "inscripto en : " + this.titulo);
        return inscripcion;
    }
    
    
    public void mostrarInscripciones(){
        System.out.printf("\n---- Inscripciones en: " + this.titulo + " ---");
        for(Inscripcion i: inscripciones){
            System.out.printf("° nombre: " + i.getEstudiante().getNombre() +
                         "| fecha: " + i.getFecha() +
                        "| estado: " + i.getEstado()
            );
        }
    }
    
    public final void mostrarIdentificador() {
        System.out.println("ID: " + id + " | Título: " + titulo + " | Cupo: " + cupoMaximo);
    }
    
    
    //Taller y Charla lo implementan diferente -> metodo abstracta
    public abstract double calcularCostoMateriales();
    
    // devuelve tipo de actividad (charla o taller) -> metodo abstracto
    public abstract String getTipo();
    
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getCupoMaximo() {
        return cupoMaximo;
    }
    
    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    

}