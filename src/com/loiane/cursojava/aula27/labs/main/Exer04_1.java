package com.loiane.cursojava.aula27.labs.main;

import java.util.Scanner;


import com.loiane.cursojava.aula27.labs.objetos.JogoDaVelha_1;

public class Exer04_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JogoDaVelha_1 jogodavelha = new JogoDaVelha_1();
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if(jogodavelha.vezJogador()) {
				System.out.println("Vez do  jogador (X). Escolha sua jogada. ");
				sinal = 'X';
			} else {
				System.out.println("Vez do  jogador (O). Escolha sua jogada. ");
				sinal = 'O';
			}
				
			linha = valor("Linha", input);
			coluna = valor("Coluna", input);
			
			jogodavelha.verificarJogada(linha, coluna, sinal);
			jogodavelha.imprimirTabuleiro();
			
			if(jogodavelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador (X) ganhou!");
			} else if(jogodavelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador (O) ganhou!");
			} else if(jogodavelha.jogada == 9) {
				ganhou = true;
				System.out.println("Deu velha!");
				
			}
			
				
		}
				
	}
	
	static int valor(String tipoValor, Scanner input) {
		int valor = 0;
		boolean verificarValor = false;
		while(!verificarValor) {
			System.out.println("Entre com a "+ tipoValor +" (1, 2 ou 3)");
			valor = input.nextInt();
			if(valor >= 1 && valor <= 3) {
				verificarValor = true;
			} else {
				System.out.println("Linha inválida. Digite novamente!");
			}
		}
		valor--;
		return valor;	
	}
}
