package examenA;

public class Ejercicio1 { 
	public static void main(String[] args) {
		String[] paises = {"España","Francia","Reino unido","Italia","Alemania","Dinamarca"};
		//18:20  03/01/2018
		int[] puntuaciones= new int[6];
		for (int i = 0; i < puntuaciones.length; i++) {
			puntuaciones[i]=(int) (Math.random()*9);
		}
		
		for (int j = 0; j < puntuaciones.length; j++) {
			System.out.print (puntuaciones[j]+" ");
		}
		int maximo=Integer.MIN_VALUE;
		String ganador = null;
		for (int j = 0; j < puntuaciones.length; j++) {
			
			if (puntuaciones[j]>maximo) {
				maximo=puntuaciones[j];
				ganador=paises[j];
			}
			
				
			}
		System.out.println("El ganador es "+ganador+" con una puntuacion de "+maximo);
		}
	}
		//18:57  03/01/2018




