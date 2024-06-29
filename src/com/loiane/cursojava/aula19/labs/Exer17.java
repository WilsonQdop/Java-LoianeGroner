package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] idades = new int[10];
		int qtdMaiores35 = 0;
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println("Idade da pessoa " + i + ": ");
			idades[i] = input.nextInt();
			if(idades[i] > 35) {
				qtdMaiores35++;
			}
		}
		for(int i : idades) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Na lista informada, teve " + qtdMaiores35 + " pessoas maiores dee 35 anos.");

	}

}
