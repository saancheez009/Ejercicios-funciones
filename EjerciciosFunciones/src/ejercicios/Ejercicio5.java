package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	//Creamos una función llamada vocal donde introducimos la variable letra
static boolean vocal (String letra) {
	boolean  result=false ;
	//Si la letra es igual a,e,i,o y u, el resultado es true
	if (letra.equals ("a") || letra.equals ("e") || letra.equals ("i") || letra.equals ("o") || letra.equals ("u")) {
	result= true;
	}
	return result; //Le devolvemos el resultado al usuario 

}
	public static void main(String[] args) {
		
		//Declaramos la variable letra , esta será introducida por el usuario
		String letra;
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc =new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca una letra
		System.out.println("Por favor introduzca una letra ");
		letra=sc.nextLine();
		letra = letra.toLowerCase();
		
		//Le mostramos al usuario si la letra introducida es consonante o vocal
		//Si es vocal será true, mediante un ternario, añadiremos la respuesta de vocal y consonante
		System.out.println(vocal (letra) ? "Es vocal " : "Es consonante");

	}

}
