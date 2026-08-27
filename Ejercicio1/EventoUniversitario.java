class EventoUniversitario{
    
    private final String Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;
    private Sala sala; // asociar con su sala
    
    //constructor
    public EventoUniversitario(String id, String titulo,double costoBase, boolean gratuito
    ){
        this.Id = id;
        this.titulo = titulo;
        this.costoBase = gratuito ? 0.0 : costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }
    
    //constructor de copia recibe todos los parametros del constructor
    //crea un objeto del mismo tipo y clona sus valores
    public EventoUniversitario(EventoUniversitario otro) {
        this.Id = otro.Id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        cantidadEventos++;
    }
    
    //metodo get
    public double calcularCostoEstimado(){
        return this.gratuito ? 0.0 : costoBase;
    }
    
    public static int getCantidadEventos(){
        return cantidadEventos;
    }
    
    
    
    //set
    public void asignarSala(Sala sala){
        this.sala = sala;
    }
    
    
    //simular acciones
    public void crearActividad(int id, String titulo, int cupo){
        System.out.println("Actividad creada \n ID: "+id+"\n TITULO:"+cupo+"\n CUPO:"+cupo);
    }
    
    public void mostrarDatos() {
        System.out.println("Evento [ID: " + Id + ", Titulo: " + titulo + 
                           ", Costo Base: $" + costoBase + ", Gratuito: " + gratuito + "]");
    }
}