package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Entre com um número: ");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Entre com um número: ");
		double segundoNumero = scan.nextDouble();
		
		double maiorNumero= primeiroNumero;
		if(segundoNumero > primeiroNumero) {
			maiorNumero = segundoNumero;
		}
		
		System.out.printf("O maior número digitado foi: %.2f ", maiorNumero);
	}

}
