package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe a posição da posição " + i + ": ");
			a[i] = input.nextInt();
			
			b[i] = a[i];
		}
		System.out.println("Vetor a = ");
		for(int vetorA : a) {
			System.out.println(vetorA);
		}
		
		System.out.println("Vetor b = ");
		for(int vetorB : b) {
			System.out.println(vetorB);
		}

	}

}
