package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer40 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o limite: ");
		int limite = input.nextInt();
		int cont = 1;
		double soma = 0;
		for(int i = 1, j = 1; i <= limite; i++, j+=2) {
			System.out.print(i + "/" + j + " + ");
		
			soma += i/j;
			
		}
		System.out.println("Soma = " + soma);

	}

}
