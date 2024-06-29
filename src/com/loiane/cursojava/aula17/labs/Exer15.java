package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fatorial=1;
		
		System.out.println("Informe o número do fatorial: ");
		int numero = input.nextInt();
		
		for(int i=1;i<=numero;i++) {
			if(numero >0 && numero <16) {
				fatorial = fatorial * i;
				
			}
			else {
				System.out.println("Tente novamente: ");
				 numero = input.nextInt();
			}
			
		}
		System.out.println(fatorial);

	}

}
