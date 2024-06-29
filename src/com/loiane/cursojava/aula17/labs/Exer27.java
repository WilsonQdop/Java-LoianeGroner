package com.loiane.cursojava.aula17.labs;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma=0;
		boolean verificador = true;
		
		System.out.println("Informe a quantidade de turmas ");
		int qtdTurmas = input.nextInt();

		for(int i = 0; i < qtdTurmas; i++) {
			
			while(verificador) {
			System.out.println("Informe a quantidade de alunos da turma " + (i + 1));
			int alunos = input.nextInt();
			
			if(alunos < 40) {
				verificador = false;
			}
			else {
				System.out.println("Números de alunos inválidos. Tente novamente!");
			}			
				soma+= alunos;		
		}

	}
		double media = (double) soma / qtdTurmas;
		System.out.println("Foram calculado " + qtdTurmas + " turmas e deu um total de: " + soma + " alunos.");
		System.out.println("Média dos alunos: " + media);
	}
}
