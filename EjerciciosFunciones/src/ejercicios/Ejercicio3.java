package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	static void opcion (int radio, int altura, int opción) { 
		double área;
		double volumen;
		switch(opción) {
		  case 1:
			  área = (2*Math.PI)* radio * (altura + radio);
			  System.out.println("El área del cilindro es: "+área);
			  break;
		  case 2:
			  volumen =  (double) (Math.PI* radio*radio * altura);
			  System.out.println("El volumen del cilindro es:"+volumen);
			  break;
		}
	}
	public static void main(String[] args) {
	int opción;
	int radio;
	int altura;
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor introduzca el radio de la base del cilindro:");
	radio=sc.nextInt();
	System.out.println("Por favor introduzca la altura del cilindro: ");
	altura=sc.nextInt();
	
	System.out.println("Por favor seleccione una opción: ");
	System.out.println("1. Cálculo de área");
	System.out.println("2. Cálculo de volumen");
	opción=sc.nextInt();
	
	
	opcion(radio, altura, opción);
	
	}

}
