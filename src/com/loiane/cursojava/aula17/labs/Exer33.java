package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean primo = true;
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				System.out.println(numero + " Não é primo");
				break;
			}
			else {
				System.out.println(numero + " é um número primo.");
				break;
			}
		}
		
		

	}

}
