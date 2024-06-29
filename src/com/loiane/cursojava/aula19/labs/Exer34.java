package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe os valores de "  + i + " posição do vetor: ");
			vetorA[i] = input.nextInt();
		}
		for(int i = 0; i < vetorA.length; i++) {			
			System.out.println("relação dos números pares até: " + vetorA[i]);
			
			for(int j = 2; j <= vetorA[i]; j++) {
				if(j % 2 == 0) {
					System.out.println(j);
				}
			}
		}

	}

}
