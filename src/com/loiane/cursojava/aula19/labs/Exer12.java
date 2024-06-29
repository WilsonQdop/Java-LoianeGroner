package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a posição " + i + " do vetorA: ");
			vetorA[i] = input.nextInt();
			soma += vetorA[i];
		}
		System.out.print("Vetor A = ");
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println("A soma do vetor: " + soma);
	}

}
