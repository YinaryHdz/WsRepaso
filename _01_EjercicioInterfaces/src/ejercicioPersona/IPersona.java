package ejercicioPersona;

import java.util.List;

public interface IPersona {

	void cambiarCiudad(String nuevaiCudad);
	void actualizarPeso(double nuevoPeso);
	boolean identificarSiEsMayorDeEdad(int edad);
	List<String>eliminarTelefonos();
	void eliminarTelefono(String telefono);
	
}
