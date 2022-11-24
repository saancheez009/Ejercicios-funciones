package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
static boolean vocal (String letra) {
	boolean  result=false ;
	if (letra.equals ("a") || letra.equals ("e") || letra.equals ("i") || letra.equals ("o") || letra.equals ("u")) {
	result= true;
	}
	return result;

}
	public static void main(String[] args) {
		String letra;
		Scanner sc =new Scanner(System.in);
		System.out.println("Por favor introduzca una letra ");
		letra=sc.nextLine();
		letra = letra.toLowerCase();
		System.out.println(vocal (letra) ? "Es vocal " : "Es consonante");

	}

}
