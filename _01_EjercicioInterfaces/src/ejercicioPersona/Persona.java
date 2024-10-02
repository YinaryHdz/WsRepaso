package ejercicioPersona;

import java.util.List;

public class Persona implements IPersona {
    private String nombre;
    private String apellido;
    private int edad;
    private final TipoIdentificacion IDENTIFICACION;
    private String sexo;
    private String ciudad;
    private double altura;
    private double peso;
    private List<String> telefonos;

    public Persona(String nombre, String apellido, int edad, TipoIdentificacion IDENTIFICACION, String sexo,
                   String ciudad, double altura, double peso, List<String> telefonos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.IDENTIFICACION = IDENTIFICACION;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.altura = altura;
        this.peso = peso;
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", IDENTIFICACION=" +
                IDENTIFICACION + ", sexo=" + sexo + ", ciudad=" + ciudad + ", altura=" + altura + ", peso=" + peso +
                ", telefonos=" + telefonos + "]";
    }

    // Getters y Setters

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

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    // Métodos 

    public void cambiarCiudad(String nuevaCiudad) {
        this.ciudad = nuevaCiudad;
        System.out.println("La ciudad ha sido actualizada a: " + nuevaCiudad);
    }

    public void actualizarPeso(double nuevoPeso) {
        this.peso = nuevoPeso;
        System.out.println("El peso ha sido actualizado a: " + nuevoPeso);
    }

    public void eliminarTelefono(String telefono) {
        if (telefonos.remove(telefono)) {
            System.out.println("El teléfono " + telefono + " ha sido eliminado.");
        } else {
            System.out.println("El teléfono " + telefono + " no se encontró.");
        }
    }

	public boolean identificarSiEsMayorDeEdad(int edad) {
		 return edad >= 18;
	}

	public List<String> eliminarTelefonos() {
		 telefonos.clear(); 
	        System.out.println("Todos los teléfonos han sido eliminados.");
	        return telefonos;
	}
}

