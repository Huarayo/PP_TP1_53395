/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

Evento -> no clase aislada
Evento -> relaciona con agenda de actividades, sala asignada y estudiantes inscriptos en cada actividades

Sistema -> pueda
    a. crear eventos
    b. asignar a cada evento una sala
    c. registrar sus actividades
    d. lista de alumnos en cada actividad
    
Main ->
    a. Se construya una lista de estudiantes.
    b. Se construyan eventos.
    c. Se asigne una sala cada evento.
    d. Se creen actividades propias de cada evento.
    e. Se inscriban estudiantes en cada actividad.
    f. Se muestre el resumen de datos por cada evento creado.
    g. Se muestre el total de eventos creados.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		

	    
	    // a. crear estudiantes en una lista
	    List<Estudiante> estudiantes = new ArrayList<>();
	    estudiantes.add(new Estudiante("10234", "Ana Gomez"));
        estudiantes.add(new Estudiante("10567", "Bruno Diaz"));
	    
        // b. crear eventos
		EventoUniversitario charla = new EventoUniversitario("EV001", "Charla de IA", 0, true);

		//copia de un objeto -> evitar pasar referencia
		EventoUniversitario eventCopia = new EventoUniversitario(charla);
	    
	    // c. asignar salas
	    charla.asignarSala(new Sala(1,"Sala Principal"));
	    
	    // d. crear actividades
	    
	    charla.crearActividad(1,"Taller Teorico",5);
	    charla.crearActividad(2,"Taller Práctico",5);
	    
	    // e. inscripcion de estudiantes en cada actividad
	    for( Actividad act : charla.getActividades()){
	        //asignar a cada estudiante las actividades que existan
	        for( Estudiante e: estudiantes){
	            act.inscribir(e); //se conecta con Incribir(Estudiante)
	        }
	    }
	    
	    // f. mostrar resumen de datos por cada evento
	    charla.mostrarDatos();
	    
	    // g. total de eventos creados
	    System.out.println("\nTotal de eventos creados: " + EventoUniversitario.getCantidadEventos());
	}
}
