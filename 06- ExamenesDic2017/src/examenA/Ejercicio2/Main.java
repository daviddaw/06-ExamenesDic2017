package examenA.Ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String respuesta;
		double suma=0;
		do {
			System.out.println("Escribe el nombre del articulo");
			String nombre=in.next();
			System.out.println("Escribe el precio");
			double precio=in.nextDouble();
			String categoria;
			do {
				System.out.println("Escribe una de las siguientes categorias Novedad/Temporada/Defectuoso/Descatalogado");
				categoria=in.next();
				
			} while (!(categoria.equalsIgnoreCase("novedad") ||categoria.equalsIgnoreCase("temporada")
					||categoria.equalsIgnoreCase("Defectuoso")||categoria.equalsIgnoreCase("descatalogado")));

			
			Articulo arti = new Articulo( nombre,precio,categoria);
			System.out.println("  ");
			 System.out.println(arti.toString());
			 
			 suma=suma+arti.precioRebajado();
			
			System.out.println("Quieres crear otro articulo S/N");
			respuesta=in.next();
		} while (respuesta.equalsIgnoreCase("S"));
		System.out.println(suma);
		
		
		
	}
}
