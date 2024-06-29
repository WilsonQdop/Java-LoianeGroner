package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double preco = 1.99;
		double soma = 0;
		
		System.out.println("Informe quantos itens você levou: ");
		int qtdItens = input.nextInt();
		if(qtdItens > 40) {
			System.out.println("Quantidade de itens inválido: ");
			input.close();
			return;
		} 
		else {		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for(int i = 1; i <= qtdItens; i++) {
			
			soma += preco;
			System.out.printf("%d - %.2f\n", i, soma);
			
		}
		}
	}

}
