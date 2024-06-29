package com.loiane.cursojava.aula27.labs.main;

import java.util.Scanner;

import com.loiane.cursojava.aula27.labs.objetos.JogoDaVelha;

public class Exer04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean ganhador = false;
		int jogador = 1;
		String tabuleiro;
	
		JogoDaVelha jogo = new JogoDaVelha();
		
		
		while(!ganhador) {
			jogo.imprimirTabuleiro();
			
			if(jogador % 2 == 1) {
				System.out.println("Vez do jogador (X). Faça a sua jogada");
			} else {
				System.out.println("Vez do jogador (O). Faça a sua jogada");
			}
			
			int jogada = input.nextInt();
			int[] posicao = obterPosicao(jogada);
			
			if(jogo.tabuleiro[posicao[0]][posicao[1]].equalsIgnoreCase("x") || jogo.tabuleiro[posicao[0]][posicao[1]].equalsIgnoreCase("o")) {
				if(jogador % 2 == 1) {
					jogo.tabuleiro[posicao[0]][posicao[1]] = "X";
				}
				else {
					jogo.tabuleiro[posicao[0]][posicao[1]] = "O";
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

	

	

}
