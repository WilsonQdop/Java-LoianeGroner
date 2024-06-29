package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] tabuleiro = new String[3][3];
		boolean ganhador = false;
		int cont = 1, jogador = 1;
		
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = String.valueOf(cont);
				cont++;
			}
		}
				
		while(!ganhador) {
		
			for(int i = 0; i < tabuleiro.length; i++) {
				for(int j = 0; j < tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");
					
				}
				System.out.println();
			}
			
			if(jogador % 2 == 1) {
				System.out.println("Vez do jogador (X), Faça sua escolha: ");
			}
			else {
				System.out.println("Vez do jogador (O), faça sua escolha");
			}
			
			int jogada = input.nextInt();
			int[] posicao = obterPosicao(jogada);
				
			
			if(tabuleiro[posicao[0]][posicao[1]].equalsIgnoreCase("x") || tabuleiro[posicao[0]][posicao[1]].equals("o")) {
				jogada--;
				System.out.println("Espaço já está preenchido, tente novamente!");
			}
			if(jogador % 2 == 1) {
				tabuleiro[posicao[0]][posicao[1]] = "X";
			}
			else if(jogador % 2 == 0) {
				tabuleiro[posicao[0]][posicao[1]] = "O";
			}
			
			
			ganhador = verificarGanhador(tabuleiro);
			if(ganhador) {			
				for(int i = 0; i < tabuleiro.length; i++) {
					for(int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j] + " | ");
					}
					System.out.println();
					
				}
				if(jogador % 2 == 1) {
					System.out.println("Jogador (X) venceu!");
				}
				else {
					System.out.println("Jogador (O) venceu!");
				}
				if(jogador == 9) {
					System.out.println("Jogo empatou!");
					ganhador = true;
				}
				
			}
			jogador++;
		}
		
		
	}
	public static int[] obterPosicao(int jogada) {
		int[] pos = new int[2];
		pos[0] = (jogada - 1) / 3;
		pos[1] = (jogada - 1) % 3;
		return pos;
	}
	public static boolean verificarGanhador(String[][] tabuleiro) {
		for(int i = 0; i < 3; i++) {
			if(tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][1].equals(tabuleiro[i][2])) {
				return  true;
			}
			if(tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[1][i].equals(tabuleiro[2][i])) {
				return  true;
			}
			if(tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[i][i].equals(tabuleiro[2][2]) ) {
				return true;
			}
			if(tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[i][i].equals(tabuleiro[2][0])) {
				return  true;
			}
		}
		return false;
	}
}
