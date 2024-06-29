package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] pares = new int[10];
		int cont = 0;
		String output= "";
		
		for(int i = 0; i < pares.length; i++) {
			System.out.println("Informe o valor da posição: " + i + ": ");
			pares[i] = input.nextInt();
			
			if(pares[i] % 2 == 0) {
				cont++;
				output = "Foram digitados " + cont + " números pares.";
			}
		}
		System.out.println(output);

	}

}
