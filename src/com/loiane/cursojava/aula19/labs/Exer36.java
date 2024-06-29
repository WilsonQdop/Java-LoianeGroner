package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] vetorA = new double[11];
		
		for(int i = 1; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2, i);
			System.out.println(vetorA[i]); 
		
		}

	}

}
