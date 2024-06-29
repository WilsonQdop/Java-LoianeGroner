package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = scan.nextDouble();
		
		if(numero >= 0) {
			System.out.printf("O número digitado é positivo: %.2f ", numero );
		}
		else {
			System.out.printf("O número digitado é negativo: %.1f ", numero );
		}
	}

}
