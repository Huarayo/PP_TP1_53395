import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario{
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private Sala sala;
    private List <Actividad> actividades;
    public static int cantidadEventos = 0;
    
    public EventoUniversitario(String id,String titulo, double costoBase, boolean gratuito){
        this.Id = id;
        this.titulo=titulo;
        this.costoBase=costoBase;
        this.gratuito=gratuito;
        this.actividades = new ArrayList <>();
        this.cantidadEventos++;
    }
    
    public EventoUniversitario(EventoUniversitario otro){
        this.Id = otro.Id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.actividades = new ArrayList <>(otro.actividades);
    }
    
    public double calcularCostoEstimado(){
        if(gratuito){
            return 0.0;   
        }
        
        double sumaCostosMateriales = 0;
        for(Actividad act: actividades) {
            sumaCostosMateriales += act.calcularCostoMateriales();
        }
        
        return (costoBase + sumaCostosMateriales) * 1.21;
    }
    
    public void asignarSala(Sala sala){
        this.sala = sala;
        System.out.println("nombre: "+this.sala.getNombre()+ " asignada a " + this.titulo);
    }
    
    public void crearActividad(String tipo, int id, String titulo,int cupo){
        if(tipo.equalsIgnoreCase("Charla")) {
            Charla charla = new Charla(id, titulo,cupo, "por definir");
            actividades.add(charla);
            System.out.println("charla creada: "+this.titulo);
        } else if (tipo.equalsIgnoreCase("Taller")){
            Taller taller = new Taller(id,titulo,cupo,false);
            actividades.add(taller);
            System.out.println("Taller creado");
        }
    }
    
    public void mostrarDatos(){
        System.out.println("\n ================ EVENTO "+titulo+" ==================");
        System.out.println("Id: " + Id);
        System.out.println("Costo Base: " + costoBase);
        System.out.println("Gratuito: " + gratuito);
        System.out.println("Sala: " + (sala != null ? sala.getNombre() : "Sin Asignar"));
        System.out.println("Actividades: " + actividades.size());
        System.out.println("Costo Estimado: " + calcularCostoEstimado());
        
        System.out.printf("\n --------Actividades ----------");
        for(Actividad act: actividades){
            act.mostrarIdentificador();
            System.out.println("  Tipo: "+ act.getTipo()+
                              "  Costos: " + act.calcularCostoMateriales()+
                              "  Inscriptos " + act.inscripciones.size()
                              
            );
            act.mostrarInscripciones();
        }
        
        System.out.println("=================================\n");
        
    }
    
    public List<Actividad> getActividades() {
        return actividades;
    }
    
    public String getTitulo(){
        return titulo;
    }
}