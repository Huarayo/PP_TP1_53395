import java.time.LocalDate;

class Inscripcion{
    private Estudiante estudiante; //referencia
    private LocalDate fecha;
    private String estado;
    
    public Inscripcion(Estudiante estudiante){
        this.estudiante = estudiante;
        this.fecha = LocalDate.now();
        this.estado = "activa";
    }
    public Estudiante getEstudiante(){
        return estudiante;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }
}