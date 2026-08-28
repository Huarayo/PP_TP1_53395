import java.time.LocalDate;

public class Inscripcion{
    
    private Estudiante estudiante;
    private Actividad actividad;
    private LocalDate fecha;
    private String estado;
    
    public Inscripcion(Estudiante estudiante, Actividad actividad){
        this.estudiante = estudiante;
        this.actividad = actividad;
        this.fecha = LocalDate.now();
        this.estado = "activo";
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    public Actividad getActividad(){
        return this.actividad;
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Inscripcion{" +
                "\nestudiante=" + estudiante.getNombre() +
                "\n, actividad=" + actividad.getTitulo() +
                "\n, fecha=" + fecha +
                "\n, estado='" + estado + '\'' +
                '}';
    }

}