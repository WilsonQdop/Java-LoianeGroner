package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		int doisVetorA = 1;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a posição do vetor " + i + ": ");
			vetorA[i] = input.nextInt();
			vetorB = vetorA;
			
		}
		System.out.print("Vetor a = ");
		for(int i = 0; i < vetorA.length; i++) {
			doisVetorA = vetorA[i];
			doisVetorA *= 2;
			
			System.out.print(doisVetorA + " ");
		}
		System.out.println();
		
		System.out.print("Vetor b = " );
		for(int b : vetorB) {
			
			System.out.print(b + " ");
		}
	}

}
