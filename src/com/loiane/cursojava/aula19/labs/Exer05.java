package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição do vetor " + i + ": ");
			vetorA[i] = input.nextInt();
			vetorB[i] = vetorA[i] * i;
		}
		System.out.print("vetor A = ");
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int b : vetorB) {
			System.out.print(b + " ");
		}
	}

}
