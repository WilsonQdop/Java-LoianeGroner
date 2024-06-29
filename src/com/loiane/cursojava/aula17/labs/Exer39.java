package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer39 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean verificacao = true;
		int codigo = 0, qtdComida = 0;
		double preco = 0, total = 0;
		String output = "";

		while (verificacao) {
			System.out.println("Informe o código do produto: ");
			codigo = input.nextInt();
			System.out.println("Informe a quantidade: ");
			qtdComida = input.nextInt();
			
			if (codigo == 0 && qtdComida == 0) {
				verificacao = false;
				output += "Total a pagar " + total;
			} 
			else {
				switch (codigo) {

				case 100:
					output += "Cachorro quente -> 1,20 * " + qtdComida;
					double cachorroQuente = 1.20;
					preco = cachorroQuente + qtdComida;
					total += preco;
					output += " = " + preco + "\n"; 
					
					break;
				case 101:
					output += "Bauru Simples -> 1,30 * " + qtdComida;
					double bauruSimples = 1.30;
					preco = bauruSimples + qtdComida;
					total += preco;
					output += " = " + preco + "\n"; 
					break;
				case 102:
					output += "Bauru com ovo -> 1,50 * " + qtdComida;
					double bauroComOvo = 1.50;
					preco = bauroComOvo + qtdComida;
					total += preco;
					output += " = " + preco + "\n"; 
					break;
				case 103:
					output += "Bauru com ovo -> 1,20 * " + qtdComida;
					double hamburguer = 1.20;
					preco = hamburguer + qtdComida;
					total += preco;
					output += " = " + preco + "\n"; 
					break;
				case 104:
					output += "Bauru com ovo -> 1,30 * " + qtdComida;	
					double chessburguer = 1.30;
					preco = chessburguer + qtdComida;
					total += preco;
					output += " = " + preco + "\n"; 
					break;
					
				case 105:
					output += "Bauru com ovo -> 1,30 * " + qtdComida;	
					double refrigerante = 1;
					preco = refrigerante + qtdComida;
					total += preco;
					output += " = " + preco + "\n"; 
					break;
				default:
					System.out.println("código inválido!");
				}
				
			}
			
		}
		System.out.println(output);
	
	}
	
}
