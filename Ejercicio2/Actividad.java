import java.util.List;
import java.util.ArrayList;

class Actividad{
    int id;
    String titulo;
    int cupoMaximo;
    
    //lista a llenar
    private List<Inscripcion> inscripciones;
    
    public Actividad(int id,String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>(); //lista vacia
    }
    
    //constante compartida para toda la clase
    static final int CUPO_MINIMO = 5;
    
    
    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion nueva = new Inscripcion(estudiante);
        inscripciones.add(nueva); //agregar a lista
        return nueva;
    }
    
    public void mostrarInscripciones(){
        System.out.println("  - " + this.titulo + " (cupo: " + this.cupoMaximo + ")");
        if (inscripciones.isEmpty()) {
            System.out.println("      (sin inscripciones)");
            return;
        }
        int numero = 1;
        for (Inscripcion i : inscripciones) {
            Estudiante e = i.getEstudiante();
            System.out.println("      " + numero + ". " + e.getNombre() + " [" + e.getLegajo() + "]");
            numero++;
        }
    }
}