package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerr37 {

	public static void main(String[] args) {
		Scanner input  =  new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe os valores de "  + i + " posição do vetor: ");
			vetorA[i] = input.nextInt();
		}
		for(int i = 1; i < vetorA.length; i++) {
			vetorB[i] = 1;
			for(int j = 1; j <= vetorA[i]; j++) {
			vetorB[i] *= j;	
			
			
			}
		}
		System.out.print("Vetor A = ");
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i]  + " ");
		}
		

	}

}
