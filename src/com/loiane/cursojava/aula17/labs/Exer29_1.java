package com.loiane.cursojava.aula17.labs;

public class Exer29_1 {

	public static void main(String[] args) {
		final double preco = 1.99;
		System.out.println("Lojas Quase Dois - Tabela de Preços");
		for(int i = 1; i <= 50; i++) {
			double tabelaPreco = preco*i;
			System.out.printf("%d - R$ %.2f.\n",i,tabelaPreco);
		}

	}

}
