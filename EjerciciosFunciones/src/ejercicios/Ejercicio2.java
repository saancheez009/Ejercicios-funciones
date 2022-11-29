package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	//Creamos una función llamada funcion, en la que declaramos las variables num1 y num2
	static void funcion  (int num1, int num2) {
		
		//Para que el sistema nos devuelva los números desde num1 hasta num2, creamos un for 
		for(int i=num1; i<=num2; i++) {
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
	//Declaramos las variables num1 y num2 , que serán introducidos por el usuario, aparecerán los números contados desde num1 hasta num2
	int num1;
	int num2;
	
	//Introducimos e importamos el scanner para poder el teclado 
	Scanner sc = new Scanner(System.in);
	
	//Le pedimos al usuario que introduzca dos números enteros 
	System.out.println("Por favor introduzca dos números enteros");
	num1=sc.nextInt();
	num2=sc.nextInt();

	sc.close(); //Cerrramos el scanner 
	//introducimos la función en el main para que el código funcione
	funcion(num1,num2);
	}

}
