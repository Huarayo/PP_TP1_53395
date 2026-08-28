/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main {
    
    public static void main(String[] args){
        System.out.println("========== SISTEMA DE EVENTOS UNIVERSITARIOS ==========\n");
        
        // a) REGISTRAR ESTUDIANTES
        System.out.println("a) REGISTRANDO ESTUDIANTES:");
        Estudiante est1 = new Estudiante("2024001", "Juan Pérez");
        Estudiante est2 = new Estudiante("2024002", "María García");
        Estudiante est3 = new Estudiante("2024003", "Carlos López");
        System.out.println(est1.getNombre());
        System.out.println(est2.getNombre());
        System.out.println(est3.getNombre());
        
        
        // b) CONSTRUIR LOS EVENTOS
        System.out.printf("\nb) CONSTRUYENDO EVENTOS:");
        EventoUniversitario evento1 = new EventoUniversitario("01","Presentación Proyectos",5000,false);
        EventoUniversitario evento2 = new EventoUniversitario("02", "Conferencia de IA", 500.0, true);
        System.out.println(evento1.getTitulo());
        System.out.println(evento2.getTitulo());

        // c) ASIGNAR SALAS
        System.out.println("\nc) ASIGNANDO SALAS:");
        Sala sala1 = new Sala(103,"Aula Total");
        Sala sala2 = new Sala(400,"Aula Conferencias");
        evento1.asignarSala(sala1);
        evento2.asignarSala(sala2);
        
        // d) CREAR ACTIVIDADES
        System.out.println("\nd) CREANDO ACTIVIDADES:");
        evento1.crearActividad("Taller", 3, "Introducción", 100);
        evento1.crearActividad("Taller", 4, "Conclusión",400);
        
        evento2.crearActividad("Charla", 1, "Inteligencia Artificial", 200);
        evento2.crearActividad("Charla", 2, "Tarde de charla", 300);
        
        // e) INSCRIPCION ESTUDIANTES
        System.out.println("\ne) INSCRIBIENDO ESTUDIANTES:");
        evento1.getActividades().get(0).inscribir(est1);
        evento2.getActividades().get(1).inscribir(est2);
        evento1.getActividades().get(1).inscribir(est1);
        evento2.getActividades().get(0).inscribir(est3);
        
        // f) RESUMEN POR EVENTO 
        System.out.println("\nf) RESUMEN EVENTOS Y ACTIVIDADES");
        evento1.mostrarDatos();
        evento2.mostrarDatos();
        
        // g) CANTIDAD EVENTOS
        System.out.println("\n g) CANTIDAD DE EVENTOS: "+ EventoUniversitario.cantidadEventos);
    }
    
}