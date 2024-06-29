package com.loiane.cursojava.aula27.labs.objetos;

public class JogoDaVelha {

	public String[][] tabuleiro = new String[3][3];
	int cont = 1;

	
	public void inicializarTabuleiro() {
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j <tabuleiro[i].length; j++) {	
				tabuleiro[i][j] = String.valueOf(cont);
				cont++;
			}
		}
	}
	public void imprimirTabuleiro() {
		for(int i = 0; i < tabuleiro.length; i++) {	
			System.out.println();
			for(int j = 0; j < tabuleiro[i].length; j++ ) {
				System.out.print(cont + " | ");
				cont++;
			}
			System.out.println();
		}
	}
	
	
}
