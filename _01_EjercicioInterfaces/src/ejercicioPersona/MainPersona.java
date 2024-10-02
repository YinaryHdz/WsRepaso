package ejercicioPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPersona {
	List<String> telefonos = new ArrayList<>();
	private static List<Persona> listaPersonas;
	private static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		listaPersonas = new ArrayList<>();

		int opcion = 0;

		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				crearPersona();
				break;
			case 2:
				mostrarPersonas();
				break;
			case 3:
				actualizarCiudad();
				break;
			case 4:
				actuaalizarPeso();
				break;
			case 5:
				eliminarTelefono();
				break;
			case 6:
				eliminarVariosTelefonos();
				break;
			default:
				System.out.println("Saliendo del programa ;)");
				break;
			}
		} while (opcion != 7);
	}

	private static void eliminarVariosTelefonos() {
		 System.out.println("Introduzca el nombre y apellido de la persona para eliminar varios teléfonos:");
	        String nombre = sc.nextLine();
	        String apellido = sc.nextLine();
	        
	        for (Persona persona : listaPersonas) {
	            if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getApellido().equalsIgnoreCase(apellido)) {
	                List<String> telefonos = persona.getTelefonos();
	                if (telefonos.isEmpty()) {
	                    System.out.println("No hay teléfonos para eliminar.");
	                } else {
	                    System.out.println("Teléfonos actuales: " + telefonos);
	                    telefonos.clear();
	                    System.out.println("Todos los teléfonos han sido eliminados.");
	                }
	                return;
	            }
	        }
	        System.out.println("Persona no encontrada.");
		
	}

	private static void eliminarTelefono() {
		System.out.println("Introduzca el nombre y apellido de la persona:");
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();
        
        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Teléfonos actuales: " + persona.getTelefonos());
                System.out.println("Introduzca el teléfono a eliminar:");
                String telefono = sc.nextLine();
                persona.eliminarTelefono(telefono);
                return;
            }
        }
        System.out.println("Persona no encontrada.");
		
	}

	private static void actuaalizarPeso() {
		System.out.println("Introduzca el nombre y apellido de la persona:");
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();

        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Peso actual: " + persona.getPeso());
                System.out.println("Introduzca el nuevo peso:");
                double nuevoPeso = sc.nextDouble();
                persona.actualizarPeso(nuevoPeso);
                return;
            }
        }
        System.out.println("Persona no encontrada.");
	}

	private static void actualizarCiudad() {
		System.out.println("Introduzca el nombre y apellido de la persona:");
        String nombre = sc.nextLine();
        String apellido = sc.nextLine();

        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombre) && persona.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Ciudad actual: " + persona.getCiudad());
                System.out.println("Introduzca la nueva ciudad:");
                String nuevaCiudad = sc.nextLine();
                persona.cambiarCiudad(nuevaCiudad);
                return;
            }
        }
        System.out.println("Persona no encontrada.");
		
	}

	private static void mostrarPersonas() {
		if (listaPersonas.isEmpty()) {
            System.out.println("No hay personas dadas de alta.");
        } else {
            System.out.println("Personas dadas de alta:");
            for (Persona persona : listaPersonas) {
                System.out.println(persona);
            }
        }
		
	}

	private static void crearPersona() {
	    System.out.println("Introduzca los datos de la persona a ingresar");
	    System.out.print("Introduzca el nombre: ");
	    String nombre = sc.nextLine();
	    System.out.print("Introduzca el apellido: ");
	    String apellido = sc.nextLine();
	    System.out.print("Introduzca la edad: ");
	    int edad = Integer.parseInt(sc.nextLine());
	    System.out.print("Introduzca el tipo de identificación: ");
	    String tipoIdentificacion = sc.nextLine();
	    System.out.print("Introduzca el número de identificación: ");
	    String numeroIdentificacion = sc.nextLine();
	    System.out.print("Introduzca el sexo: ");
	    String sexo = sc.nextLine();
	    System.out.print("Introduzca la ciudad: ");
	    String ciudad = sc.nextLine();
	    System.out.print("Introduzca la altura: ");
	    double altura = Double.parseDouble(sc.nextLine());
	    System.out.print("Introduzca el peso: ");
	    double peso = Double.parseDouble(sc.nextLine());

	    List<String> telefonos = new ArrayList<>();
	    System.out.println("¿Cuántos teléfonos desea ingresar?");
	    int cantidadTelefonos = Integer.parseInt(sc.nextLine());
	    for (int i = 0; i < cantidadTelefonos; i++) {
	        System.out.print("Ingrese el teléfono " + (i + 1) + ": ");
	        String telefono = sc.nextLine();
	        telefonos.add(telefono);
	    }

	    TipoIdentificacion identificacion = new TipoIdentificacion(tipoIdentificacion, numeroIdentificacion);
	    Persona persona = new Persona(nombre, apellido, edad, identificacion, sexo, ciudad, altura, peso, telefonos);
	    listaPersonas.add(persona);
	    System.out.println("Persona creada correctamente.");
	}


	private static int mostrarMenu() {
		System.out.println("Introduzca una opcion:");
		System.out.println("1- Dar de alta persona");
		System.out.println("2- Mostrar personas dadas de alta");
		System.out.println("3- Actualizar ciudad");
		System.out.println("4- Actualizar peso");
		System.out.println("5- Eliminar un telefono");
		System.out.println("6- Eliminar varios telefonos");
		System.out.println("6- Salir");

		int iOpcion = recogerEntero();
		return iOpcion;
	}

	private static int recogerEntero() {
		String sOpcion = sc.nextLine();
		int iOpcion = Integer.parseInt(sOpcion);
		return iOpcion;
	}

}
