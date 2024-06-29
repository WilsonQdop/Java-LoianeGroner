package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero =0;
		boolean verificar = false;
		
		while(!verificar) {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			if(numero >=0 && numero <=10) {			
				verificar = true;
				System.out.println("Você digitou: " + numero);
			}
			else {
				verificar = false;
				System.out.println("Número inválido, tente novamente.");
			}
		}
	}

}
