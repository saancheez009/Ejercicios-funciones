package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	//Creamos una función para poder realizar los cálculos del menú de opciones.
	static void opcion (int radio, int altura, int opción) { 
		double área;    //Introducimos la variable área
		double volumen; //Introducimos la variable volumen
		
		//Mediante un switch declaramos que si la opción introducida es 1 , se realizará el cálculo del área del cilindro 
		switch(opción) {
		  case 1:
			  área = (2*Math.PI)* radio * (altura + radio);
			  System.out.println("El área del cilindro es: "+área);
			  break;
			  
		// Si el usuario introduce 2 como opción, se reqalizará el cálculo del volumen del cilindro
		  case 2:
			  volumen =  (double) (Math.PI* radio*radio * altura);
			  System.out.println("El volumen del cilindro es:"+volumen);
			  break;
		}
	}
	public static void main(String[] args) {
	//Declaramos las variables opción, radio y altura 
		
	int opción; //Esta variable es la opción que introducirá el usuario para el cálculo de el área o el volumen 
	int radio;  //Para los cáculos necesitamos saber el radio y la altura
	int altura;
	
	//Introducimos e importamos el scanner para poder leer el teclado
	Scanner sc = new Scanner(System.in);
	
	//Le pedimos al usuari que introduzca el radio de la base del cilindro y la altura del cilindro
	System.out.println("Por favor introduzca el radio de la base del cilindro:");
	radio=sc.nextInt();
	System.out.println("Por favor introduzca la altura del cilindro: ");
	altura=sc.nextInt();
	
	
	//Le mostramos un menú de opciones mediante el cual eligirá 1 el cálculo de el área o 2, el cálculo del volumen
	System.out.println("Por favor seleccione una opción: ");
	System.out.println("1. Cálculo de área");
	System.out.println("2. Cálculo de volumen");
	opción=sc.nextInt();
	
	sc.close(); //Cerramos el scanner 
	
	//introducimos la función en el main para que el código funcione
	opcion(radio, altura, opción);
	
	}

}
