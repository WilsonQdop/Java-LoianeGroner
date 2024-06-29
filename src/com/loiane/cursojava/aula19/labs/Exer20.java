package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] vetorA = new double[20];
		double cotacao;
		System.out.println("Insira o cotação do dolar: "); 
		cotacao = input.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++) {		
			vetorA[i] = cotacao * (i+1);
			
		}
		for(double c : vetorA) {
			System.out.printf("%.2f ", c);
		}
		
	}
}
