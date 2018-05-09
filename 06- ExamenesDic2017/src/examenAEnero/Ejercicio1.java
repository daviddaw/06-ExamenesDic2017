package examenAEnero;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo un array con los nombres de los paises y otro con las puntuaciones
		// enteras
		// tipo_de_dato[] NombreArray = {"nombre","nombre1"};
		String[] arrayPaises = { "España", "Francia", "Reino Unido","Italia","Alemania","Dinamarca" };
		int[] arrayPunt = new int[6];

		// Damos las puntuacionesa los paises
		for (int i = 0; i < arrayPunt.length; i++) {
			arrayPunt[i] = (int) (Math.random() * 10+1);
		}

		// Vemos las puntuaciones
		for (int i = 0; i < arrayPunt.length; i++) {
			System.out.println(arrayPaises[i] + " " + arrayPunt[i]);
		}

		// primer y segundo premio
		int maximo = Integer.MIN_VALUE;
		int siguiente = Integer.MIN_VALUE;
		String primero = null, segundo = null;
		for (int i = 0; i < arrayPunt.length; i++) {
			// Tengo que guardar la puntuacion mas alta
			if (arrayPunt[i] > maximo) {

				maximo = arrayPunt[i];

				primero = arrayPaises[i];

			}

		}

		for (int i = 0; i < arrayPunt.length; i++) {
			// Tengo que guardar la segunda puntuacion mas alta
			if (arrayPunt[i] < maximo && arrayPunt[i] > siguiente) {

				siguiente = arrayPunt[i];
				segundo = arrayPaises[i];

			}

		}

		//recorrer para imprimir todos los países con la misma puntuación para no tener que 
		//hacer dos for uno para buscar el primero y otro para
		//el segundo, concatenamos todos los países en el string de salida correspondiente
		for (int i = 0; i < arrayPunt.length; i++) {
			if (arrayPunt[i]==maximo)
				primero+=" "+arrayPaises[i]; //añadimos al string el país que acabamos de encontrar
			
				if (arrayPunt[i]==siguiente) //ídem
				segundo+=" "+arrayPaises[i];
		}
		
		
		System.out.print(" Primera posicion "+ primero +" con "+maximo+" puntos ");
		System.out.println();
		System.out.print(" Segunda posicion "+ segundo +" con "+siguiente+" puntos ");
		System.out.println();
		// y la segunda mas alta

	}

}
