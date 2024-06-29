package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] notas1 = new int[10];
		int[] notas2 = new int[notas1.length];
		double[] result =  new double[notas1.length];
		int aprovado = 0, reprovado = 0;
		
		for(int i = 0; i < notas1.length; i++) {
			System.out.print("Informe a nota 1 do " + (i+1) + " aluno: ");
			notas1[i] = input.nextInt();
			System.out.print("Informe a nota 2 do " + (i+1) + " aluno: ");
			notas2[i] = input.nextInt();
			
			result[i] = (notas1[i] + notas2[i]) / 2;
			
			if(result[i] >= 7) {
				aprovado++;
			}
			else {
				reprovado++;
			}
		}
		for(double r : result) {
			System.out.print(r + " ");
		}
		System.out.println();
		System.out.println("O total de alunos aprovados: " + aprovado);
		System.out.println("O total de alunos reprovados: " + reprovado);
		

	}

}
