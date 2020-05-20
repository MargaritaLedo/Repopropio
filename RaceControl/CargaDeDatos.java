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
	
	}
	
