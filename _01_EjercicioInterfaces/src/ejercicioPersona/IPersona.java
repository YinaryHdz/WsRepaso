package ejercicioPersona;

import java.util.List;

public interface IPersona {

	void agregarPersona(Persona persona);
	void eliminarPersona(Persona persona);
	boolean identificarSiEsMayorDeEdad(int edad);
	List<Persona>buscarPorCiudad(String ciudad);
	
}
