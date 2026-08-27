import java.util.List;
import java.util.ArrayList;

class EventoUniversitario{
    final String Id;
    String titulo;
    double costoBase;
    boolean gratuito;
    public static int cantidadEventos;
    
    private Sala sala;
    //tiene 1 o más actividades
    private List<Actividad> actividades;
    
    public EventoUniversitario(String id,String titulo,float costoBase,boolean gratuito){
        this.Id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        cantidadEventos++;
    }
    
    //constructor de copia 
    public EventoUniversitario(EventoUniversitario otro){
        this.Id = otro.Id; //el valor que ya tiene el objeto lo clono
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala; //la copia es capaz de leer sala si al objeto ya se le asigno
        //copia la lista vieja (el contenido) no las referencia
        this.actividades = new ArrayList<>(otro.actividades);
        cantidadEventos++;
    }
    
    public double calcularCostoEstimado(){
        return this.gratuito ? 0.0 : costoBase;
    }
    
    public void asignarSala(Sala sala){
        //guardar el objeto completo
        this.sala = sala;
    }
    

    public void crearActividad(int id, String titulo, int cupo){
        Actividad nueva = new Actividad(id, titulo, cupo);
        actividades.add(nueva);
    }
    
    public void mostrarDatos() {
        System.out.println("\n--- Resumen del evento ---");
        System.out.println("Titulo : " + this.titulo);
        System.out.println("ID     : " + this.Id);
        System.out.println("Costo  : $" + calcularCostoEstimado());
        System.out.println("Sala   : " + (this.sala != null ? this.sala.getNombre() : "Sin asignar"));
        System.out.println("\nActividades e inscripciones:");
        for (Actividad a : actividades) {
            a.mostrarInscripciones();
        }
    }
    
    public static int getCantidadEventos() {
        return cantidadEventos;
    }
    
    public List<Actividad> getActividades() {
        return actividades;
    }
    
}