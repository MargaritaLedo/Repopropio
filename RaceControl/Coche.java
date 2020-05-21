package RaceControl;

public class Coche  {
		private String marca;
		private String modelo;
		private int velocidad_maxima;//en km/h
		private int distanciaIntervalo;
		private int distanciaTotal;
		
		private int puntostorneo;
		
// se crea el constructor de coche pasandole parámetros.		
		public Coche (String marca, String modelo) {
			this.marca=marca;
			this.modelo=modelo;
			this.velocidad_maxima=200; //200 km/hora	
			this.puntostorneo = 0;		
		}

// El metodo calcular distancia lo que hace es por que calcula un velocidad aletoria por cada intervalo de tiempo, 1 hora, entonces si le asigna 50 km/horas esa es la distancia 50 y se la suma a distancia total
		public void calculardistancia() {
			distanciaIntervalo= (new Double(Math.random() *velocidad_maxima)).intValue();
			distanciaTotal=distanciaTotal+distanciaIntervalo;
		}

		/*public int compareTo(Coche coche){
			return 1;
		}*/
//metodo to string para que pinte bien los atributos 		
		@Override
		public String toString() {
			return "\n El coche " + marca  + " modelo=" + modelo + " ha recocorrido una distancia total de " + distanciaTotal+ " km  " ;
		 
		}

		
		/**
		 * @return the marca
		 */
		public String getMarca() {
			return marca;
		}


		/**
		 * @param marca the marca to set
		 */
		public void setMarca(String marca) {
			this.marca = marca;
		}


		/**
		 * @return the modelo
		 */
		public String getModelo() {
			return modelo;
		}


		/**
		 * @param modelo the modelo to set
		 */
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		/**
		 * @return the velocidad_maxima
		 */
		public int getVelocidad_maxima() {
			return velocidad_maxima;
		}


		/**
		 * @param velocidad_maxima the velocidad_maxima to set
		 */
		public void setVelocidad_maxima(int velocidad_maxima) {
			this.velocidad_maxima = velocidad_maxima;
		}


		/**
		 * @return the distanciaIntervalo
		 */
		public int getDistanciaIntervalo() {
			return distanciaIntervalo;
		}


		/**
		 * @param distanciaIntervalo the distanciaIntervalo to set
		 */
		public void setDistanciaIntervalo(int distanciaIntervalo) {
			this.distanciaIntervalo = distanciaIntervalo;
		}


		/**
		 * @return the distanciaTotal
		 */
		public int getDistanciaTotal() {
			return distanciaTotal;
		}




		/**
		 * @param distanciaTotal the distanciaTotal to set
		 */
		public void setDistanciaTotal(int distanciaTotal) {
			this.distanciaTotal = distanciaTotal;
		}

		/**
		 * @return the puntostorneo
		 */
		public int getPuntostorneo() {
			return puntostorneo;
		}

		/**
		 * @param puntostorneo the puntostorneo to set
		 */
		public void setPuntostorneo(int puntostorneo) {
			this.puntostorneo = this.puntostorneo +  puntostorneo;
		}
		
		

	
}//llave final de la clase
