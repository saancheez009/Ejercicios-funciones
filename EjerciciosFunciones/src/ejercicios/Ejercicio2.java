package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	static void funcion  (int num1, int num2) {
		for(int i=num1; i<=num2; i++) {
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor introduzca dos números enteros");
	num1=sc.nextInt();
	num2=sc.nextInt();

	funcion(num1,num2);
	}

}
