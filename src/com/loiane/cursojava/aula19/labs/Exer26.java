package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da " + i + " posição do vetor A: ");
			vetorA[i] = input.nextInt();
			System.out.println("Informe o valor da " + i + " posição do vetor B: ");
			vetorB[i] = input.nextInt();

			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
		}
		System.out.print("Vetor A = ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int c : vetorC) {
			System.out.print(c + " ");
		}

	}

}
