package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	static int maximo (int num1 , int num2) {
	
	if (num1>num2) {
		return (num1);
	}else {
		return (num2);
	}
	
	}
	

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número: ");
		num1=sc.nextInt();
		
		System.out.println("Por favor introduzca otro número:");
		num2=sc.nextInt();
		
		System.out.println(maximo(num1, num2));
	

	}

}
