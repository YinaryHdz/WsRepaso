package condicionales;

public class _01_Condicionales {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 3;
		
		if (num1 < num2) {
			System.out.println("El  numero 3 es mayor");
		}else {
			System.out.println("El  numero 0 es menor");
		}

		        
		diaSemana("6");
	}
	public static String diaSemana (String numero) {
		int n = Integer.valueOf(numero);
		if (n == 1 ) {
			System.out.println("lunes");	
		}else if (n == 2 ) {
			System.out.println("martes");	
		}else if (n == 3 ) {
			System.out.println("miercoles");	
		}else if (n == 4 ) {
			System.out.println("jueves");	
		}else if (n == 5 ) {
			System.out.println("viernes");	
		}else if (n == 6 ) {
			System.out.println("sabado");	
		}else if (n == 7){
			System.out.println("domingo");
		}else{
			System.out.println("numero no reconocido");
		}
		
		return numero;
		
	}

}
