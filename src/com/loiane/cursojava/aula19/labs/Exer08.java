package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição do vetorA " + (i+1) + ": ");
			vetorA[i] = input.nextInt();
			System.out.println("Informe o valor da posição do vetorB " + (i+1) + ": ");
			vetorB[i] = input.nextInt();
			
			vetorC[i] =  vetorA[i] * vetorB[i];
			
		}
		System.out.print("vetor A = ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
		System.out.println();

		System.out.print("Vetor c = ");
		for (int c : vetorC) {
			System.out.print(c + " ");
		}
		

	}

}
