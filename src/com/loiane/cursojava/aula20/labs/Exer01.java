package com.loiane.cursojava.aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] matrizM = new int[4][4];
		Random numeroRandom = new Random();
		
		int maiorNumero = Integer.MIN_VALUE, maiorColuna = Integer.MIN_VALUE, maiorLinha = Integer.MIN_VALUE;

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				
				if(matrizM[i][j] > maiorNumero) {
					maiorNumero = matrizM[i][j];
					maiorLinha = i;
					maiorColuna = j;
					
				}
				
			}
			
		}
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " ");			
			}	
			System.out.println();
		}
		System.out.println("Maior número: " + maiorNumero + " está na coluna: " + maiorColuna + " e na linha: " + maiorLinha);
		
	}

}
