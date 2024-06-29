package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numero = new int[10];
		int somaMenor15 = 0, numeroIgual15 = 0, somaMaiores15 = 0, cont = 0;
		double media = 0;
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Informe o numero na posição " + i + ": ");
			numero[i] = input.nextInt();

			if (numero[i] < 15) {
				somaMenor15 += numero[i];
			} else if (numero[i] == 15) {
				numeroIgual15++;
			} else if (numero[i] > 15) {
				somaMaiores15 += numero[i];
				cont++;
				media = somaMaiores15 / cont;
			}	
		}
		
		for(int num : numero) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("a) a soma de elementos armazenados neste vetor que são menores do que 15: " + somaMenor15);
		System.out.println("b) a quantidade de elementos armazenados neste vetor que são iguais a 15: " + numeroIgual15);
		System.out.println("c) a media do elementos armazenados neste vetor que são superiores a 15: " + media);

	}

}
