package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int contMultiplo5 = 0;
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a posição " + i + " do vetorA: ");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] % 5 == 0) {
				contMultiplo5 += vetorA[i];
			}
		}
		System.out.print("Vetor A = ");
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("A soma de números múltiplos de 5: " + contMultiplo5); 

	}

}
