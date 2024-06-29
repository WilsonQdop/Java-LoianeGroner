package com.loiane.cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inicio;
		int fim;
		
		System.out.println("Digite um número de início: ");
		inicio = input.nextInt();
		System.out.println("Digite um número de fim: ");
		fim = input.nextInt();
		System.out.println("------------------------------");
		
		while(inicio < fim) {
			System.out.println(inicio);
			inicio++;
					
		}
		while(inicio >= fim) {
			System.out.println(inicio);
			inicio--;
		}
		
		
	}

}
