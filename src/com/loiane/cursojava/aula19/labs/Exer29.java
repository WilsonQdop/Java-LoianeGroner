package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA  = new int[10];
		int[] vetorB  = new int[vetorA.length];
		int[] vetorC  = new int[20];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe um valor para a posição " + i + "do vetor A");
			vetorA[i] = input.nextInt();
			System.out.println("Informe um valor para a posição " + i + "do vetor B");
			vetorB[i] = input.nextInt();
			
			vetorC[i] = vetorA[i];
			vetorC[vetorA.length + i] = vetorB[i];
			
		}
//		for(int i = 0; i < vetorA.length; i++) {
//			System.out.println("Informe um valor para a posição " + i + "do vetor B");
//			vetorB[i] = input.nextInt();
//		}
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
