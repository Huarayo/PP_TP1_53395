class Sala {
    private String nombre;
    private int capacidad;
    public Sala(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
}