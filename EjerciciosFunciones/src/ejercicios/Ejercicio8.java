package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	static void calculadora(int num1, int num2, int opcion) {
		int suma;
		int resta;
		int multiplicacion;
		int division;
		
	switch (opcion) {
	
	case 1:
		suma= num1+num2;
		System.out.println("La suma de los dos números reales es: "+suma);
		break;
	
	case 2:
		resta =num1-num2;
		System.out.println("La resta de los dos números reales es: "+resta);
		break;
	case 3:
		multiplicacion= num1*num2;
		System.out.println("La multiplicación de los dos números reales es: "+multiplicacion);
		break;
	case 4:
		division=num1/num2;
		System.out.println("La division de los dos números reales es: "+division);
		break;
	
	}
		
		
	}

	public static void main(String[] args) {
	int num1 = 0;
	int num2 = 0;
	int opcion;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Por favor introduzca dos números reales:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	System.out.println("Ahora por favor elija una de las siguientes opciones");
	System.out.println("1. Suma");
	System.out.println("2. Resta");
	System.out.println("3. Multiplicación");
	System.out.println("4. División");
	opcion=sc.nextInt();
	
	calculadora(num1, num2, opcion);
	}
	}