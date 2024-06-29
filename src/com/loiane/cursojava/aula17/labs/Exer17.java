package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int par = 0, numDivisores = 0, qtdDivisores = 0;
		boolean primo = true;

		System.out.println("Informe um número: ");
		int numero = input.nextInt();
		System.out.println("Divisores do número " + numero + ": ");
		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0) {
				numDivisores++;
				System.out.println(i);

			} 		
		}
		System.out.println("======================");
		if(numDivisores == 2) {
			System.out.println(numero + " é um número primo: ");
		}
		else {
			System.out.println(numero + " não é um número primo");
		}

		
	}

}
