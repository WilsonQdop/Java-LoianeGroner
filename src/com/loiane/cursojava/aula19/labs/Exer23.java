package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma = 0;			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite os números (Digite um número impar para encerrar.)");
				numeros[i]  = input.nextInt();
				
				if (numeros[i] % 2 == 0) {
					soma += numeros[i];
				}
				else {
					System.out.println("Número impar informado. Programa encerrado...");
					break;			
			}
		}		
		
		System.out.println("Soma dos números pares: " + soma);
	}

}
