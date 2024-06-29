package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean verificador = true;
		int cont=0, soma = 0;
		double media = 0.0;
		
		while(verificador) {
			cont++;
			System.out.println("Digite a idade da " + cont + " pessoa: ");
			int idade = input.nextInt();
			
			if(idade > 0) {
				soma += idade;
				media = soma / cont;							
			}			
			else {
				verificador = false;
			}					
		}
		System.out.println("A média da turma: " + media);
		 if(media <= 25) {
				System.out.println("A turma é considerada jovem.");
		 }
		 else if(media > 25 && media < 60) {
			 System.out.println("A turma é considerada adulta");
		 }
		 else {
			 System.out.println("A turma é considerada velha.");
		 }
	}

}
