package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os números para o vetor A " + i + ": ");
			vetorA[i] = input.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}
		System.out.print("Vetor A = ");
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
