package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Creamos una función llamada máximo , en ella introducimos num1 y num2
	static int maximo (int num1 , int num2) {
	
		//Mediante el condicional if declaramos que si num1 es mayor que num2, se devuelva el num1 y si es al revés se devuelva el num2
	if (num1>num2) {
		return (num1);
	}else {
		return (num2);
	}
	
	}
	

	public static void main(String[] args) {
		//Declaramos las variables num1 y num2 que serán introducidas por el usuario
		int num1;
		int num2;
		
		
		//Importamos e introducimos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca dos números para devolverle el número mayor 
		System.out.println("Por favor introduzca un número: ");
		num1=sc.nextInt();
		
		System.out.println("Por favor introduzca otro número:");
		num2=sc.nextInt();
		
		
		//introducimos la función en el main para que el código funcione, mientras le mostramos al usuario el número mayor a través de esta función
		System.out.println(maximo(num1, num2));
	

	}

}
