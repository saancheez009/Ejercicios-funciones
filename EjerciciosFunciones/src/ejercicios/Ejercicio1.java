package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	//Creamos la función eco , en ella declaramos la variable número, que ha sido declarada también en el menú
	static void  eco	(int numero) {
		//Para que la palabra eco nos aparezca x veces según desee el usuario, creamos un for e imprimimos la palabra eco
		for(int i=1; i<=numero;i++)  {
			System.out.println("eco");
		}
		
		
		
	}
		
		
		//Mediante el método main declaramos la variable número y le pedimos un número al usuario
		public static void main(String[] args) {
		//Declaramos la variable número, que será el número de veces que el sistema nos devolverá la palabra eco, el usuario introducirá este número
		int numero;
		
		//Introducimos e importamos el Scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca un número 
		System.out.println("Por favor introduzca un número ");
		numero=sc.nextInt();
		
		//introducimos la función en el main para que el código funcione
	eco(numero);
		}

	}
