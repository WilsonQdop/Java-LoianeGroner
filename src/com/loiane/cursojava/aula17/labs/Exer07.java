package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		int maior=0;
		for(int i=1; i<=5; i++) {
			System.out.println("Entre com um número: ");
			int numero = input.nextInt();
			if(i == 1) {
				maior=numero;
			}
			
			if(numero >= maior) {
				maior=numero;
			}
		}
		System.out.println("O maior número: " + maior);
	}

}
