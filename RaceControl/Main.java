package RaceControl;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	
 //probamos la clase coche
		Coche coche1=new Coche("ferrari", "360");
		Coche coche2=new Coche("mercedes", "slk");

		
		while(coche1.getDistanciaTotal()<500 || coche2.getDistanciaTotal()<500) {
			
			coche1.calculardistancia();
			coche2.calculardistancia();
			System.out.println("coche1 "+ coche1.getDistanciaTotal());
			System.out.println("coche2 "+ coche2.getDistanciaTotal());
			
		}
*/
		
//probamos la clase carrera estandar. creamos la carrera Rallymondoñedo, llamamos a los coches que van a aparticipar y que estar cargados en la clase CargaDeDatos y ejecutamos el metodo disputarcarrera.	
// lo que nos va a sacar es para cada intervalo de tiempo (1 hora) cuantos km llevan recorridos cada coche, los datos son acumulativos , entonces los km que lleven en la tercera (y ultima) hora seria la clasificación fina de ellos.		
	
		Carrera Rallymondoñedo =new CarreraEstandar("Rallymondoñedo",3);
		Rallymondoñedo.setCochesParticipantes(CargaDeDatos.cochesparticipantes());
		Rallymondoñedo.disputarcarrera();
	
		
		
	}

}
