package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matriz = new double[30][4];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe os valores da posição do i " + (i+1) + " e do j " + (i+1) + ": ");
				matriz[i][j] = Math.round(Math.random() * 10);
				
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("[");
			System.out.println("---------------");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("]");
		}

	}

}
