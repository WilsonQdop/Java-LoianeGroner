package com.loiane.cursojava.aula27.labs.objetos;

public class JogoDaVelha_1 {
	public char[][] tabuleiro = new char[3][3];
	public int jogada = 1;
	
	
	public void imprimirTabuleiro() {

		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
	}
	public boolean verificarJogada(int linha, int coluna, char sinal) {
		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			return false;
		} else {
			tabuleiro[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	public boolean verificarGanhador(char sinal) {
		if((tabuleiro[0][0] == sinal && tabuleiro[0][1] == (sinal) && tabuleiro[0][2] == sinal || // Linha 1
				((tabuleiro[1][0] == sinal  && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) || // Linha 2
				((tabuleiro[2][0] == sinal  && tabuleiro[2][1] == sinal && tabuleiro[2][2]  == sinal)) || // Linha 3
				((tabuleiro[0][0] == (sinal)  && tabuleiro[1][0] == (sinal) && tabuleiro[2][0] == (sinal))) || // Coluna 1
				((tabuleiro[0][1] == (sinal)  && tabuleiro[1][1] == (sinal) && tabuleiro[2][1] == (sinal))) || // Coluna 2
				((tabuleiro[0][2] == (sinal)  && tabuleiro[1][2] == (sinal) && tabuleiro[2][2] == (sinal))) || // Coluna 3
				((tabuleiro[0][0] == (sinal)  && tabuleiro[1][1] == (sinal) && tabuleiro[2][2] == (sinal)))))) { // Diagonal
			return true;
		}
		return false;
	}
	
	public boolean vezJogador() {
		if(jogada % 2 == 1) {
			return true;
		}
		return false;
	}
}
