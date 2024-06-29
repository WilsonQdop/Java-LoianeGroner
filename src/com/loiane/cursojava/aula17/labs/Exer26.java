package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean verificador = true;
		int soma=0, cont=0;
		int recebaCont=0;
		int cont1=0, cont2=0, cont3=0;

		while (verificador) {
			System.out.println("Digite em qual candidato deseja votar (1 - Lula, 2 - Bolsonaro, 3 - Ciro Gomes): ");
			int opcao = input.nextInt();
			if(opcao > 0 && opcao < 4) {

			soma += cont1 + cont2+ cont3;
				
			} 
			else {
				System.out.println("Programa encerrado...");
				verificador = false;
			}
			switch (opcao) {

			case 1:
				System.out.println("Você votou no Lula");
				cont1++;
				break;
			case 2: 
				System.out.println("Você votou no Bolsonaro");
				cont2++;
				break;
			case 3:
				System.out.println("Você votou no Ciro Gomes");
				cont3++;
				break;
			}
					
		}
		
		
		System.out.println("======================================");
		System.out.println("O total de votantes: " + soma);
		System.out.println("O total de candidatos de lula: " + cont1);
		System.out.println("O total de candidatos de Bolsonaro: " + cont2);
		System.out.println("O total de candidatos de Ciro Gomes: " + cont3);

	}

}
