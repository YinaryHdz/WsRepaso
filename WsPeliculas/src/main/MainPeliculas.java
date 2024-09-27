package main;

import java.util.Scanner;

public class MainPeliculas {
	public static Scanner sc = null;
	public static void main(String[] args) {
		mostrarMenu();
	}
	private static int mostrarMenu() {
		System.out.println("Introduzca una opcion:");
		System.out.println("1- Agregar Pelicula");
		System.out.println("2- Listar Pelicula");
		System.out.println("3- Buscar Pelicula");
		System.out.println("4- Salir del programa");
		
		int iOpcion = recogerEntero();
		return iOpcion;
	}
	private static int recogerEntero() {
		String sOpcion = sc.nextLine();
		int iOpcion = Integer.parseInt(sOpcion);
		return iOpcion;
	}
}
