/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// a. creación de eventos universitarios
        EventoUniversitario charla = new EventoUniversitario("EV001", "Charla de Inteligencia Artificial", 0, true);
        
        charla.asignarSala(new Sala("Auditorio Principal",200));
        charla.crearActividad(001, "cuerda", 139);
        
        // b. constructor de copia 
        EventoUniversitario copiaCharla = new EventoUniversitario(charla);
        
        // c. mostrar datos
        charla.mostrarDatos();
        copiaCharla.mostrarDatos();

        //total eventos
        System.out.println("Contador Eventos: " + EventoUniversitario.getCantidadEventos());
	}
}
