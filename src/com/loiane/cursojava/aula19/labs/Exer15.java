package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorA = new int[10];
		double par = 0, impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a posição " + i + " ");
			vetorA[i] = input.nextInt();

		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				par++;
			}
		}
		
		impar = vetorA.length - par;
		double porcPar =  (par * 100) / vetorA.length;
		double porcImp = 100 - porcPar;	
		
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Porcentagem par: " + porcPar);
		System.out.println("Porcentagem impar: " + porcImp);
	}
}
