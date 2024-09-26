package negocio;

public interface ICatalogoPeliculas {
	String agregarPelicula(String nombrePelicula, String nombreArchivo);
	String listarPeliculas(String nombreArchivo);
	String buscarPelicula(String nombreArchivo, String buscar);
	String iniciarArchivo(String nombreArchivo);
	
}
