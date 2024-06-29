package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregulares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o número de pessoas que seram entrevistadas: ");
		int numEntrevistados = input.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidades de filhos: ");
			int qtdFilhos = input.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Entre com o nome do filho: " + (j+1));
				nomesFilhos[i][j] = input.next(); 
				
				
			}
		}
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("A pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filhos");
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
				
			}
		}

	}

}
