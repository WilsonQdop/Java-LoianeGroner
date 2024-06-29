package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe os valores de "  + i + " posição do vetor: ");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Divisores de: " + vetorA[i]);
			
			for(int j = 1; j <= vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					System.out.println(j);
				}
			}
		}
	}
}
