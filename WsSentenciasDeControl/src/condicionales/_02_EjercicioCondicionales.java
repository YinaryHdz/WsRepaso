package condicionales;

import java.util.Scanner;

public class _02_EjercicioCondicionales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el monto total de la compra si es en decimal ponga ',' en vez de punto");
		String importe = sc.next();
		System.out.println("Importe final: " +descuento(importe));
	}
	
	public static String descuento (String compra) {
		double importe = Double.parseDouble(compra);
		double descuento = 0;
		double importeTotal = 0;
		if(importe >= 150.10) {
			descuento = 0.10;
			System.out.println("Su descuento es del 10%");
		}else if (importe >= 200.05) {
			descuento = 0.15;
			System.out.println("Su descuento es del 15%");
		}else {
			System.out.println("No recibes descuento");
		}
		importeTotal = importe - ( importe * descuento);
		return String.valueOf(importeTotal);
	}

}
