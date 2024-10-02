package datos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import domains.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos{
	
	@Override
	public boolean existe(String nombreArchivo) {
		File ruta = new File (nombreArchivo);
		return ruta.exists();
	}
	@Override
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
		try {
			FileWriter agregar = new FileWriter(nombreArchivo);
			
		} catch (IOException excepcion) {
			System.out.println("Ocurrio un error al agregar la pelicula");
			excepcion.printStackTrace();
		}
	}
	
	@Override
	public List<Pelicula> listarPeliculas(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void buscarPelicula(String nombreArchivo, String buscar) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void iniciarArchivo(String nombreArchivo) {
		// TODO Auto-generated method stub
		
	}

	

}
