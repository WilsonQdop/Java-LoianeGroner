package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int[][] matriz = new int[3][3];
		int somaPares = 0, somaImpares = 0, somaTotalPares = 0, somaTotalImpares = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				System.out.print("Informe os valores do vetor i " + i + " e do vetor j " + j + ": ");
				matriz[i][j] = input.nextInt();
				
				if(matriz[i][j] % 2  == 0) {
					somaPares++;
					somaTotalPares += matriz[i][j];
				}
				else {
					somaImpares++;
					somaTotalImpares += matriz[i][j];
				}
			}
			
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
		System.out.println("A soma dos números pares: " + somaPares + " e sua soma total é: " + somaTotalPares);
		System.out.println("A soma dos números impares: " + somaImpares + " e sua soma total é: " + somaTotalImpares);
		

	}

}
