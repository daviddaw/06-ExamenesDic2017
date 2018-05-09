package examenA.Ejercicio2;

public class Articulo {
	private String nombre;
	private double precio;
	private String categoria;
	
	public Articulo(String nombre, double precio, String categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double precioRebajado() {
		double rebaja;
		System.out.println(" la categoria es "+categoria);
		switch (categoria) {
		case "novedad"://puse "Novedad" y no funcionaba
		rebaja=(0.05);
			
			precio=precio-precio*rebaja;
			break;
		case "temporada": 
			rebaja=(0.07);
			
			precio=precio-precio*rebaja;
			break;
		case "defectuoso":
			 rebaja=(0.2);
			
			precio=precio-precio*rebaja;
			break;
		case "descatalogado":rebaja=(0.4);
			
			precio=precio-precio*rebaja;
			break;

		default:
			break;
		}


		return precio;
	}
	
	public void equals() {
		
	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + ", precioRebajado()="
				+ precioRebajado() + "]";
	}
	
	


	
	
}
