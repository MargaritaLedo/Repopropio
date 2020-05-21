package RaceControl;

import java.util.ArrayList;
import java.util.List;



public class CargaDeDatos {
	
	public static List <Coche> cochesparticipantes(){
		  List<Coche> cochesparticipantes = new ArrayList<Coche>();
		  cochesparticipantes.add(new Coche("Ferrari", "360"));
		  cochesparticipantes.add(new Coche("Peugeot", "306"));
		  cochesparticipantes.add(new Coche("Mcclaren", "F1"));
		  cochesparticipantes.add(new Coche("Mercedes", "SLK"));
		  return cochesparticipantes;
	}
// metodo de la carga de la lista de carrera y un FOR para que ya cargue los coches en las carreras.	
	public static List <CarreraEstandar> listadecarreras(){
		
	
		List<Coche> cochesCarreras = new ArrayList<Coche>();
		cochesCarreras.addAll(cochesparticipantes());
		 
		List<CarreraEstandar> listadecarreras = new ArrayList<CarreraEstandar>();
		 listadecarreras.add(new CarreraEstandar("carreraEstandar1", 3));
		 listadecarreras.add(new CarreraEstandar("carreraEstandar2", 3));
		 
		for (CarreraEstandar carrera : listadecarreras) {
			carrera.setCochesParticipantes(cochesCarreras);
		}
		 
		  return listadecarreras;
	}
	
	
	
	}
	
