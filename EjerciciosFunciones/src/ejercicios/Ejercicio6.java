package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	static boolean esPrimo(int n) {
		boolean result=true;
		if(n>0) {
			for(int i=2; i<=n/2; i++) { //En el for le damos la instrucción de que solo se sume i hasta el número introducido por el usuario
				if ( n%i==0) {
					result=false;
				}
			}
			
	 }
		return result;
	}

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor introduzca un número");
		n=sc.nextInt();
		
		System.out.println(esPrimo(n) ? "El número es primo " : "El número no es primo");
	}

}
