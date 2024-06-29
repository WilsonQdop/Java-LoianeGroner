				package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer25 {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		int perguntas = 0;
		int somaPerguntas=0;
		System.out.println("Responda às 5 perguntas. (Considere 0 - não e 1 - Sim): ");
		
		
	 
			
		System.out.print("Telefonou para a vitima? ");
		 perguntas = input.nextInt();
		 somaPerguntas+=perguntas;
		 if(perguntas < 0 || perguntas > 1) {
				System.out.println("Digite 0 para (Não) ou 1 para (Sim).");
				input.close();
				return;
			}
		 System.out.print("Esteve no local do crime? ");
		 perguntas = input.nextInt();
		 somaPerguntas+=perguntas;
		 if(perguntas < 0 || perguntas > 1) {
				System.out.println("Digite 0 para (Não) ou 1 para (Sim).");
				input.close();
				return;
			}
		 
		 System.out.print("Mora perto da vítima? ");
		 perguntas = input.nextInt();
		 somaPerguntas+=perguntas;
		 if(perguntas < 0 || perguntas > 1) {
				System.out.println("Digite 0 para (Não) ou 1 para (Sim).");
				input.close();
				return;
			} 
		 
		 System.out.print("Devia para a vítima? ");
		 perguntas = input.nextInt();
		 somaPerguntas+=perguntas;
		 if(perguntas < 0 || perguntas > 1) {
				System.out.println("Digite 0 para (Não) ou 1 para (Sim).");
				input.close();
				return;
			}
		 
		 System.out.print("Já trabalhou com a vítima? ");
		 perguntas = input.nextInt();
		 somaPerguntas+=perguntas;
		 if(perguntas < 0 || perguntas > 1) {
				System.out.println("Digite 0 para (Não) ou 1 para (Sim).");
				input.close();
				return;
			}
		 
		 
		 System.out.println(somaPerguntas);
		 	switch(somaPerguntas) {
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassino");
			break;
		default:
			System.out.println("Inocente");
 		 	
		}
		
	}
	
}
