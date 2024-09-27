package datos;

import java.util.List;

import domains.Pelicula;

public interface IAccesoDatos {
	boolean existe (String nombreArchivo);
	
    void agregarPelicula(String nombrePelicula, String nombreArchivo);
    
    List <Pelicula> listarPeliculas(String nombre);

    void buscarPelicula(String nombreArchivo, String buscar);

    void iniciarArchivo(String nombreArchivo);
}
