package RaceControl;

import java.util.Collections;
import java.util.List;

public class CarreraEstandar extends Carrera {
	
// Constructor
	public CarreraEstandar(String nombreCarrera, int duracionCarrera) {
		super(nombreCarrera, duracionCarrera);
		
	}
// El metodo disputar carrera lo que hace es que mientras el intervalo de tiempo (1 hora) sea menor que el total de la carrera (3 horas), recorre la lista de coches y calcula la distancia que lleva cada uno, de forma acumulada, es decir que la ultima interacion del bucle FOR es la distacia total que llevan los coches.
	
	public void disputarcarrera() {
		while (intevalodetiempo <= duracionCarrera) {
			System.out.println("intervalo de carrera: "+ intevalodetiempo );
			for (int i=0; i<cochesparticipantes.size();i++) {
				cochesparticipantes.get(i).calculardistancia();
		System.out.println(" el coche: " + cochesparticipantes.get(i).getMarca() +" distancia recorrida: "+ cochesparticipantes.get(i).getDistanciaTotal());
			}
			intevalodetiempo++;	
			Collections.sort(cochesparticipantes);
			for (Coche aux:cochesparticipantes) {
				System.out.println(aux);
			}
		} 
	}
	
	

	
	}//llave final de la clase


