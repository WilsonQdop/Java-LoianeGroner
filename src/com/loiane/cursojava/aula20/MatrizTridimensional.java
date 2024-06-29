package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizTridimensional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][][] matriz = new int[3][3][3]; 
		int somaTotal = 0, somaPares = 0, somaImpares = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				for(int k = 0; k < matriz[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matriz[i][j][k] = i + j + k;
				}
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				for(int k = 0; k < matriz[i][j].length; k++) {
					somaTotal += matriz[i][j][k];
					
				}
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				for(int k = 0; k < matriz[i][j].length; k++) {
					if(matriz[i][j][k] % 2 == 0) {
						somaPares += matriz[i][j][k];
					}
					else {
						somaImpares += matriz[i][j][k] ;
					}
				}
			}
		}
		System.out.println("A soma total: " + somaTotal);
		System.out.println("A soma dos pares: " + somaPares);
		System.out.println("A soma dos impares: " + somaImpares);
		
	}

}
