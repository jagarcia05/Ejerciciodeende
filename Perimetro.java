package unidad1;

import java.util.Scanner;

public class Perimetro {

	public static void main(String[] args) {
     /*programa que calcula el perimetro de un cuadrado
      * 
      */
		Scanner sc= new Scanner(System.in);
		int lado, resultado;
		
		System.out.println("Escirbe el valor del lado");
		lado = sc.nextInt();
		resultado= 4* lado;
		
		System.out.println("el perimetro de "+resultado);
		
	

	}

}
