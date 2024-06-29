package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição do vetor " + i + ": ");
			vetorA[i] = input.nextDouble();
			vetorB[i] = Math.sqrt(vetorA[i]);
			
		}
		System.out.print("Vetor A = ");
		for(double a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(double b : vetorB) {
			System.out.printf("%.2f ", b);
		}
	}

}
