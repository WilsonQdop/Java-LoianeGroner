package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor de a" + i + ": ");
			vetorA[i] = input.nextInt();
//			vetorA[i] = (int) Math.round(Math.random() * 10);
			
			
		}
		
		int posB = 0, posC = 0;
		for(int i = 0; i < vetorA.length; i++) {

			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
			else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
			
		}
		System.out.print("Vetor A = ");
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i = 0; i < posB; i++) {
			System.out.print(vetorB[i]  + " ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for(int i  = 0; i < posC; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
