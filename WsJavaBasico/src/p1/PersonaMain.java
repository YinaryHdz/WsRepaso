package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaMain {
	private static ArrayList<Persona> listaPersonas;
	public static void main(String[] args) {
		Persona p1 = new Persona("Ana", "Alvarez", 22);
		Persona p2 = new Persona ("Pepe", "Fernandez", 33);
		Persona p3 = new Persona ("Elena", "Sanchez", 44);
		listaPersonas = new ArrayList<>();
			
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		for ( Persona p : listaPersonas) {
			System.out.println(p);
		}
		PersonaMain pm = new PersonaMain();
		System.out.println(pm.menu());
	}
	public  int menu () {
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. opcion 1\n2. opcion 2\n3. opcion 3\nOpcion: ");
		opcion = sc.nextInt();
		return opcion;
	}

}
