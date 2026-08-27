
class Estudiante{
    String legajo;
    String nombre;
    
    public Estudiante(String legajo, String nombre){
        this.legajo = legajo;
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getLegajo(){
        return this.legajo;
    }
}