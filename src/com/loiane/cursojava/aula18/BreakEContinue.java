package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Entre com um número: ");
		int numero = input.nextInt();

		System.out.println("Informe um limite: ");
		int limite = input.nextInt();

		for (int i = numero; i <= limite; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				continue;
			
		}

//		for(int i = 0; i <= 4; i++) {
//			rotulo1: {
//				rotulo2: {
//					rotulo3: {
//						if(i == 1) {
//							break rotulo1;
//						}
//						if(i == 2) {
//							break rotulo2;
//						}
//						if(i == 3) {
//							break rotulo3;
//							
//						}
//						System.out.println("rotulo 3");
//					}
//					System.out.println("rotulo 2");
//				}
//				System.out.println("rotulo 1");
//			}
//			System.out.println(i);
//		}

	}
	}
}
