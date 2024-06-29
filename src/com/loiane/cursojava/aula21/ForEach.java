package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int cont = 0;
		
		Random numerosRandom = new Random();
		for(int v :  vetor) {
			v =  numerosRandom.nextInt(10);
			cont++;
			System.out.println(v);
		}
		System.out.println("Contador: " + cont);
		
		int[][] notasAlunos = new int[3][3];
		
		for(int[] notasAluno : notasAlunos) {
			for(int nota : notasAluno) {
				nota = numerosRandom.nextInt(100);
				System.out.print(nota + " ");
			}
			System.out.println();			
		}
	}

}
