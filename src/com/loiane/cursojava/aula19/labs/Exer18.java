package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] idades = new int[10];
		int maiorIdade, menorIdade, maiorPosicao = 0, menorPosicao = 0;

		for(int i = 0; i < idades.length; i++) {
			System.out.println("Idade da pessoa " + i + ": ");
			idades[i] = input.nextInt();
		
			}
		maiorIdade = idades[0];
		menorIdade = idades[0];
		
		for(int i = 1; i < idades.length; i++) {
			
			
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maiorPosicao = i;
				
			}
			else if(idades[i] < menorIdade) {
				menorIdade = idades[i];
				menorPosicao = i;
		}
		}
		for(int i : idades) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("A maior idade tem " + maiorIdade + " anos e está na posição: " + maiorPosicao); 
		System.out.println("A menor idade tem " + menorIdade + " anos e está na posição: " + menorPosicao); 
	}
}
