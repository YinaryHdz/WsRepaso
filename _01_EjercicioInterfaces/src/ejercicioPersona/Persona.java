package ejercicioPersona;

import java.util.List;

public class Persona implements IPersona{
	private String nombre;
	private String apellido;
	private int edad;
	private final TipoIdentificacion IDENTIFICACION;
	private String sexo;
	private String ciudad;
	private double altura;
	private double peso;
	
	
	public Persona(String nombre, String apellido, int edad, TipoIdentificacion identificacion, String sexo,
			String ciudad, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.IDENTIFICACION = identificacion;
		this.sexo = sexo;
		this.ciudad = ciudad;
		this.altura = altura;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", identificacion="
				+ IDENTIFICACION + ", sexo=" + sexo + ", ciudad=" + ciudad + ", altura=" + altura + ", peso=" + peso
				+ "]";
	}
	
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public TipoIdentificacion getIdentificacion() {
		return IDENTIFICACION;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public void agregarPersona(Persona persona) {
		if (persona != null) {
			System.out.println("Persona agregada correctamente: " + persona);
		}else {
			System.out.println("La persona no puede ser nula" );
		}
		
	}
	@Override
	public void eliminarPersona(Persona persona) {
		if (persona != null) {
			System.out.println("Persona eliminada correctamente: " + persona);
		}else {
			System.out.println("La persona no puede ser nula" );
		}
		
	}
	@Override
	public boolean identificarSiEsMayorDeEdad(int edad) {
		edad = this.edad;
		if(edad > 18 ) {
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	public List<Persona> buscarPorCiudad(String ciudad) {
		List<Persona> listaPersonas = null;
		for (Persona p : listaPersonas) {
			if(p.getCiudad().equalsIgnoreCase(ciudad)) {
				listaPersonas.add(p);
			}else {
				System.out.println("No existe una persona que viva en esa ciudad");
			}
		}
		return listaPersonas;
	}
	
}
