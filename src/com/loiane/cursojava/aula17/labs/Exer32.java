package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean verificador = true;
		double maiorTemperatura = 0;
		double menorTemperatura = 0;
		double media = 0, somaTemp = 0;

		do {
			System.out.print("Quantas temperaturas você quer calcular? (Digite 0 para sair.): ");
			int qtd = input.nextInt();

			if (qtd > 0) {
				for (int i = 1; i <= qtd; i++) {
					System.out.println("Informe o valor da " + i + " temperatura: ");
					double temperatura = input.nextDouble();
					
					if(i == 1) {
						maiorTemperatura = temperatura;
						menorTemperatura = temperatura;
					}
					if (temperatura > maiorTemperatura) {
						maiorTemperatura = temperatura;
					} 
					
					
					else if (temperatura <= menorTemperatura) {
						menorTemperatura = temperatura;
					}
					somaTemp += temperatura;
					media = somaTemp / i;
				}
				System.out.println("A maior temperatura digitada: " + maiorTemperatura);
				System.out.println("A menor temperatura digitada: " + menorTemperatura);
				System.out.println("A média das temperaturas: " + media);
			}
			else {
				System.out.println("Saindo ...");
				verificador = false;
			}

		} while (verificador);
		
	}

}
