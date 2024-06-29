package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		/*System.out.println("Entre com um número: ");
		int idade = scan.nextInt();

		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
		}
		else {
			System.out.println("Não é maior de idade.");
		}
		*/

        System.out.println("Digite o valor do jogo: ");
        double valor = scan.nextDouble();

        if(valor <= 10) {
            System.out.println("Barato.");
        }
        else if(valor > 10 && valor < 15) {
            System.out.println("Preço razoavel. Dá para pedir desconto.");
        }
        else if(valor >= 15 && valor < 17) {
            System.out.println("Pesquisar mais.");
        }
        else {
            System.out.println("Muito caro. ");
        }
    }
}
