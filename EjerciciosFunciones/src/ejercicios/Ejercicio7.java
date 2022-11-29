package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static int numDivisoresPrimos(int numero) {
		int cont = 0;
		
		for (int i=2; i<=numero; i++) {
			if (numero%i==0 && esPrimo(i)) {
				cont++;
			}
		}
		
		
		return cont;
		
	}

	static boolean esPrimo(int numero) {
		
		boolean result=true;
		if(numero>0) {
			for(int i=2; i<=numero/2; i++) { //En el for le damos la instrucción de que solo se sume i hasta el número introducido por el usuario
				//Sie el resto de la división de n entre i es igual a 0, el número no es primo, por tanto result es igual a false
				if ( numero%i==0) {
					result=false;
				}
			}
			
	 }
		return result; //Devolvemos el resultado.
	}

	public static void main(String[] args) {
		//Declaramos la variable n, que será un número introducido por el usuario 
		int numero;
		//Introducimos e importamos el scaner para poder leer el teclado
		Scanner sc = new Scanner (System.in);
		//Le pedimos al usuario que por favor introduzca un número 
		System.out.println("Por favor introduzca un número");
		numero=sc.nextInt();
		
		//Mediante un ternario le mostramos al usuario si es primo o no e introducimos la función en el main para que el código funcione
		System.out.println(numDivisoresPrimos(numero) );
	}

}

