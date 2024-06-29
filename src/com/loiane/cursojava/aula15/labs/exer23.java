package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numero = input.nextDouble();
		
		if(numero == Math.round(numero)) {
			System.out.println("Número inteiro");
		}
		else {
			System.out.println("Decimal");
		}

	}

}
