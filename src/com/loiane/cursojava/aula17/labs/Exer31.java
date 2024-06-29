package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fatorial =1;
		
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		System.out.print(numero + "! = ");
		for (int i = numero; i > 1; i--) {
			fatorial *= i;
			System.out.print( i + " . ");
		}
		System.out.print(" 1 = "+ fatorial );
		
	}

}
