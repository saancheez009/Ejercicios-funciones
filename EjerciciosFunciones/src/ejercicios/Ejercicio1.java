package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	static void  eco	(int numero) {
		for(int i=1; i<=numero;i++)  {
			System.out.println("eco");
		}
		
		
		
	}
		
		
		
		public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número ");
		numero=sc.nextInt();
	eco(numero);
		}

	}
