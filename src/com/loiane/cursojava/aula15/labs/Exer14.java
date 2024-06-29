		package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		String conceito;
		
		// Média de Aproveitamento;
		if(media >= 9) {
			conceito = "A";
		}
		else if(media >= 7.5 && media < 9) {
			conceito = "B";
		}
		else if(media >= 6 && media < 7.5) {
			conceito = "C";
		}
		else if(media >= 4 && media < 6) {
			conceito = "D";
		}
		else {
			conceito = "E";
		}
		
		System.out.printf("\nAluno tirou %.2f na primeira prova e %.2f na segunda, tem a média %.2f.  ", nota1, nota2, media);
		System.out.printf("\nAproveitamento do aluno? %s.  ", conceito);
			
			//Situação do estudante;
		switch(conceito) {
			case "A":			
			case "B":		
			case "C":
			
				System.out.println("\nAprovado");
				break;
			case "D":
			case "E":
		
				System.out.println("\nReprovado");
				break;
			
		}
		
	}
}
