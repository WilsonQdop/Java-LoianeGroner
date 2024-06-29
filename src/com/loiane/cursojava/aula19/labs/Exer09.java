package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição do vetorA " + (i+1) + ": ");
			vetorA[i] = input.nextInt();
			System.out.println("Informe o valor da posição do vetorB " + (i+1) + ": ");
			vetorB[i] = input.nextDouble();
			
			vetorC[i] = vetorA[i] / vetorB[i];
			
		}
		System.out.print("vetor A = ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (double b : vetorB) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.##");

		System.out.print("Vetor c = ");
		for (double c : vetorC) {
			System.out.print(c + " ");
		}
		


	}

}
