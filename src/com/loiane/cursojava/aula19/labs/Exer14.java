package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		double media = 0, soma = 0;
		int impar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a posição " + i + " do vetorA: ");
			vetorA[i] = input.nextInt();
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
				media = soma / impar;
			}
 		}
		System.out.print("Vetor A = ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(soma);
		System.out.println(impar);
		System.out.println("Media aritmetrica: " + media);
	}

}
