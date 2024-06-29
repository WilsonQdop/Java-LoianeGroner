package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0, cont = 0;
		double media = 0.0;
		boolean verificador = true;
		
		while (verificador) {
			System.out.print("Digite as notas (Para sair digite um número negativo.): ");
			double notas = input.nextInt();

			if (notas > 0) {
				soma += notas;
				cont++;
				media = (double) soma / cont;
			}
			else if(notas == 0){
				System.out.println("Nota inválida! Digite novamente.");
				
			}
			else {
				verificador = false;
			}
		}
		System.out.printf("A quantidade de notas digitadas foram %d, com a soma total de %d, e todas tem a média de: %.2f. ", cont,soma,media);		

	}

}
