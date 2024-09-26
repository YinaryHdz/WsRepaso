package domains;


public abstract class Pelicula {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + "]";
	}
	
	
}
