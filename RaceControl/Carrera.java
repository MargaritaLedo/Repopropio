
package RaceControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





//import java.util.ArrayList;
//import java.util.List;



public abstract class Carrera {
	

//atributos
	private String nombreCarrera;
	protected int duracionCarrera;
	protected int intevalodetiempo;
	protected List <Coche> cochesparticipantes; // se definen los arrays coches
	
	
//creamos el constructor de la clase Carrera
	public Carrera(String nombreCarrera, int duracionCarrera) {
		this.nombreCarrera=nombreCarrera;
		this.duracionCarrera=duracionCarrera;
		this.intevalodetiempo=1; // será 1 hora el intervalo para saber la distancia
		this.cochesparticipantes=new ArrayList<Coche>(); //array  lista de con los coches que participen
		//this.equipos=new Equipo [3]; // array con los equipos que participen	
		
	}
	
	
// creamos un metodo para el podium 
	public void podium(/*?????*/) {
		Coche[] podium=new Coche [3]; // es el podium de como van a quedar los coches que son 3
	}
	
		
//creamos el metodo abtracto que es el de disputar carrera
	public abstract void disputarcarrera(); // hace el calculo de la carrera

	
//metodo que va a comparar de mayor a menor km 	
	protected Comparator distanciaTotal = new Comparator<Coche>() {
        public int compare(Coche car1, Coche car2) {
            return (car1.getDistanciaTotal() - car2.getDistanciaTotal()) * -1;
        }
    };


	/**
	 * @return the cochesparticipantes
	 */
	public List<Coche> getCochesparticipantes() {
		return cochesparticipantes;
	}	
	
	



	/**
	 * @param coches the coches to set
	 */

	public void setCochesParticipantes(List<Coche> cochesparticipantes) {
		this.cochesparticipantes.addAll(cochesparticipantes);
		
	}

/**
	 * @return the nombreCarrera
	 */
	public String getNombreCarrera() {
		return nombreCarrera;
	}


	/**
	 * @param nombreCarrera the nombreCarrera to set
	 */
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}


	/**
	 * @return the duracionCarrera
	 */
	public int getDuracionCarrera() {
		return duracionCarrera;
	}


	/**
	 * @param duracionCarrera the duracionCarrera to set
	 */
	public void setDuracionCarrera(int duracionCarrera) {
		this.duracionCarrera = duracionCarrera;
	}


	/**
	 * @return the intevalodetiempo
	 */
	public int getIntevalodetiempo() {
		return intevalodetiempo;
	}


	/**
	 * @param intevalodetiempo the intevalodetiempo to set
	 */
	public void setIntevalodetiempo(int intevalodetiempo) {
		this.intevalodetiempo = intevalodetiempo;
	}
	
}//llave final de la clase
