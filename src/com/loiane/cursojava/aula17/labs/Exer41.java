package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma = 0;
		System.out.println("Informe o limite: ");
		int limite = input.nextInt();
		
		for(int i = 2, j = 1; i <= limite; i++) {
			System.out.print( j + "/" + i + " + ");
			soma = 1/j;
		}
		System.out.println("Soma = " + soma);
	}

}
