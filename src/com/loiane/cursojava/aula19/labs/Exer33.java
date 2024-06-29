package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int[] vetorA = new int[11];
			
			for(int i = 1; i < vetorA.length; i++) {
				System.out.println("Informe os valores de "  + i + " posição do vetor: ");
				vetorA[i] = input.nextInt();
			}
			for(int i = 1; i < vetorA.length; i++) {
				for(int j = 1; j < vetorA[i]; j++) {

					if(vetorA[i] % j == 0) {
						System.out.println(i + " não é primo");
						break;
					}
					else {
						System.out.println(i + " é primo ");
						break;
					}
				}
			}
		}

	}

}
