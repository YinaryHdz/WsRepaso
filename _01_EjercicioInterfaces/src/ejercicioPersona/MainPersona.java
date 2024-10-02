package ejercicioPersona;

import java.util.Scanner;

public class MainPersona {

	private static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);

	}
	
	private static void crearPersona() {
		System.out.println("Introduzca los datos de la persona a ingresar");	
		System.out.println("Introduzca el nombre");	
		String nombre = sc.nextLine();
		System.out.println("Introduzca el apellido");	
		String apellido = sc.nextLine();
		System.out.println("Introduzca la edad");
		int edad = sc.nextInt();
		System.out.println("Introduzca el tipo de identificacion");
		String tipoIdentificacion = sc.nextLine();
		System.out.println("Introduzca el numero de identificacion");
		int numero = sc.nextInt();
		System.out.println("Introduzca el sexo");
		String sexo = sc.nextLine();
		System.out.println("Introduzca la ciudad");
		String ciudad = sc.nextLine();
		System.out.println("Introduzca la altura");
		double altura = sc.nextDouble();
		System.out.println("Introduzca el peso");
		double peso = sc.nextDouble();
	}

}
