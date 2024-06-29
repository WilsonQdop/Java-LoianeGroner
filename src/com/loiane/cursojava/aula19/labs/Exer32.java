package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for(int i =  0 ; i < vetorA.length; i++) {
			System.out.println("Informe os valores de "  + i + " posição do vetor: ");
			vetorA[i] = input.nextInt();
			
		}
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i]);
			
			for(int j = 1; j <=10; j++) {
				int tabuada = vetorA[i] * j ;
				System.out.println(vetorA[i] + " x " + j + " = " + tabuada);
			}
			
		}

	}

}
