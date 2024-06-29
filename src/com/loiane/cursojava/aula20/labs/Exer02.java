package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {
	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		Random numerosRandom = new Random();
	
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numerosRandom.nextInt(100);
			}
		}
		
		int maiorNumeroL5 =0;
		int menorNumeroL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		
		for(int i = 0; i < matriz[linha5].length; i++) {
			if(matriz[linha5][i] > maiorNumeroL5) {
				maiorNumeroL5 = matriz[linha5][i];
			}
			 if(matriz[linha5][i] < menorNumeroL5) {
				menorNumeroL5 = matriz[linha5][i];
			}
		}
		
		int maiorNumeroC7 = 0;
		int menorNumeroC7 = Integer.MAX_VALUE;
		int coluna7 = 7;
		
			for(int i = 0; i < matriz.length; i++) {
				if(matriz[i][coluna7] > maiorNumeroC7) {
					maiorNumeroC7 = matriz[i][coluna7];
				}
				if(matriz[i][coluna7] < menorNumeroC7) {
					menorNumeroC7 = matriz[i][coluna7];
				}
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Maior numero da linha 5 da matriz: " + maiorNumeroL5);
		System.out.println("Menor numero da linha 5 da matriz: " + menorNumeroL5);
		System.out.println("Maior numero da coluna 7 da matriz: " + maiorNumeroC7);
		System.out.println("Menor numero da coluna 7 da matriz: " + menorNumeroC7);
		
	}
	
}
