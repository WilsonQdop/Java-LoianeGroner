package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana (1/7)");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {	
								
			case 2: 
					
			case 3: 
								
			case 4:
								
			case 5: 
							
			case 6: 
				System.out.println("Dia útil");
				break;
			case 1: 
			case 7: 
				System.out.println("Fim de semana");
				break;
			default: 
				System.out.println("Não é um número de semana válido");			
			}

	}
}
