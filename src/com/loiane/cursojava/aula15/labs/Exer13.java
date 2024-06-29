package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7");
		int numero = input.nextInt();
		
		switch(numero) {
			case 1:
				System.out.println("domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Número inválido.");
		}
	}
}
