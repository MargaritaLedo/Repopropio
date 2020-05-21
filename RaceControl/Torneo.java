package RaceControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Torneo {
	private List<CarreraEstandar> listadecarreras;
	String nombreTorneo;
	
	
// constructor de torneo	
	public Torneo(String nombreTorneo ) {
		this.nombreTorneo=nombreTorneo;
		this.listadecarreras=new ArrayList<CarreraEstandar>();
			
	}
//metedo que añade carreras 	
	public void setlistadecarreras(List<CarreraEstandar> listadecarreras) {
		this.listadecarreras.addAll(listadecarreras);
		
	}
	
// creamos el metodo para disputar torneo 
	public void disputartorneo(){
		for (CarreraEstandar carreraEstandar : listadecarreras) {
			carreraEstandar.disputarcarrera();
			this.asignarpuntos(carreraEstandar);
		}
		Collections.sort(listadecarreras.get(listadecarreras.size()-1).getCochesparticipantes(),puntostorneo);
		
		this.mostrarclasificaciontorneo(listadecarreras.get(listadecarreras.size()-1));
	
	}
	
// metodo para asignar puntos a los coches en funcion de los km recorridos 
		public void asignarpuntos(Carrera carrera) {
			carrera.getCochesparticipantes().get(0).setPuntostorneo(3);
			carrera.getCochesparticipantes().get(1).setPuntostorneo(2);
			carrera.getCochesparticipantes().get(2).setPuntostorneo(1);	
		}
		
		
//metodo que va a comparar de mayor a menor km 	del torneo
		protected Comparator puntostorneo = new Comparator<Coche>() {
	        public int compare(Coche car1, Coche car2) {
	            return (car1.getPuntostorneo() - car2.getPuntostorneo()) * -1;
	        }
	    };
	    
	    
//metodo para pintar los puntos
		public void mostrarclasificaciontorneo(Carrera carrera) {
			ArrayList <Coche> cochesCarrera = new ArrayList<Coche>(); 
			cochesCarrera.addAll(carrera.getCochesparticipantes());
			for (Coche coche : cochesCarrera) {
				System.out.println("\t Al final del torneo el coche: "+ coche.getMarca()+ " ha conseguido " + coche.getPuntostorneo()+" puntos" );
			}
		}
}
