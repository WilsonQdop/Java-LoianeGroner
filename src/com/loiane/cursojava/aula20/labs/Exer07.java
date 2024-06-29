package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		int jogada = 1;
		String sinal;
		int linha = 0, coluna = 0;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhador = false;
		
		//Inicializar o tabuleiro;
		
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = " ";
			}
		}
		
		while(!ganhador) {
			if(jogada % 2 == 1) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = "X";
			}
			else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3");
				sinal = "O";
			}
			
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				 linha = input.nextInt();
				 if(linha >= 1 && linha <=3) {
					 linhaValida = true;
				 } else {
					 System.out.println("Entrada inválida. Tente novamento!");
				 }
			}
			
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3)");
				coluna = input.nextInt();
				if(coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inválida. Tente novamente");
				}
			}
			
			coluna--;
			linha--;
			if(tabuleiro[linha][coluna].equalsIgnoreCase("x") || tabuleiro[linha][coluna].equalsIgnoreCase("o")) {
				System.out.println("Posição já está preenchida. Tente novamente!");
			} else { // Jogada Valida
				tabuleiro[linha][coluna] = sinal;
				jogada++;
			}
			
			// Imprimir tabuleiro
			for(int i = 0; i < tabuleiro.length; i++) {
				for(int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println();
			}
			
			// Verificar Ganhador;
			
			if((tabuleiro[0][0].equalsIgnoreCase("x")  && tabuleiro[0][1].equalsIgnoreCase("x") && tabuleiro[0][2].equalsIgnoreCase("x") || // Linha 1
					((tabuleiro[1][0].equalsIgnoreCase("x")  && tabuleiro[1][1].equalsIgnoreCase("x") && tabuleiro[1][2].equalsIgnoreCase("x")) || // Linha 2
					((tabuleiro[2][0].equalsIgnoreCase("x")  && tabuleiro[2][1].equalsIgnoreCase("x") && tabuleiro[2][2].equalsIgnoreCase("x"))) || // Linha 3
					((tabuleiro[0][0].equalsIgnoreCase("x")  && tabuleiro[1][0].equalsIgnoreCase("x") && tabuleiro[2][0].equalsIgnoreCase("x"))) || // Coluna 1
					((tabuleiro[0][1].equalsIgnoreCase("x")  && tabuleiro[1][1].equalsIgnoreCase("x") && tabuleiro[2][1].equalsIgnoreCase("x"))) || // Coluna 2
					((tabuleiro[0][2].equalsIgnoreCase("x")  && tabuleiro[1][2].equalsIgnoreCase("x") && tabuleiro[2][2].equalsIgnoreCase("x"))) || // Coluna 3
					((tabuleiro[0][0].equalsIgnoreCase("x")  && tabuleiro[1][1].equalsIgnoreCase("x") && tabuleiro[2][2].equalsIgnoreCase("x")))))) { // Diagonal
				ganhador = true;
				System.out.println("Ganhador foi o jogador 1");
			} else if ((tabuleiro[0][0].equalsIgnoreCase("o")  && tabuleiro[0][1].equalsIgnoreCase("o") && tabuleiro[0][2].equalsIgnoreCase("o") || // Linha 1
					((tabuleiro[1][0].equalsIgnoreCase("o")  && tabuleiro[1][1].equalsIgnoreCase("o") && tabuleiro[1][2].equalsIgnoreCase("o")) || // Linha 2
					((tabuleiro[2][0].equalsIgnoreCase("o")  && tabuleiro[2][1].equalsIgnoreCase("o") && tabuleiro[2][2].equalsIgnoreCase("o"))) || // Linha 3
					((tabuleiro[0][0].equalsIgnoreCase("o")  && tabuleiro[1][0].equalsIgnoreCase("o") && tabuleiro[2][0].equalsIgnoreCase("o"))) || // Coluna 1
					((tabuleiro[0][1].equalsIgnoreCase("o")  && tabuleiro[1][1].equalsIgnoreCase("oo") && tabuleiro[2][1].equalsIgnoreCase("o"))) || // Coluna 2
					((tabuleiro[0][2].equalsIgnoreCase("o")  && tabuleiro[1][2].equalsIgnoreCase("o") && tabuleiro[2][2].equalsIgnoreCase("o"))) || // Coluna 3
					((tabuleiro[0][0].equalsIgnoreCase("o")  && tabuleiro[1][1].equalsIgnoreCase("o") && tabuleiro[2][2].equalsIgnoreCase("o")))))) { // Diagonal)
				ganhador = true;
				System.out.println("Ganhador foi o jogador 2");			
			} else if(jogada > 9) {
				System.out.println("Deu velha!");
				break;
			}

	}
	}

}
