package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a quantidades dos CDS");
		int qtdCds = input.nextInt();
		double media=0;
		int soma = 0;
		for (int i = 0; i < qtdCds; i++) {
			System.out.println("Informe o preço do " + (i + 1) + " cd: ");
			 double precoCd = input.nextDouble();			
			soma += precoCd;
			media = (double) soma / qtdCds;
		}
		System.out.println(soma);
		System.out.println("A média gasta com cada Cd: " + media);
	}

}
