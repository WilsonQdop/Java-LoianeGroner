package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe os valores do vetor A "+ i + ": ");
			vetorA[i] = input.nextInt();
			
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';		
			}
			else if(vetorA[i] == 7 ) {
				vetorB[i] = 'b';
			}
			else if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}
			else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}
			else if(vetorA[i] > 10){
				vetorB[i] = 'e';
			}
 		}
		System.out.print("Vetor A = ");
		for(int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int b : vetorB) {
			System.out.print(b + " ");
		}

	}

}
