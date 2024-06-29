package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double menor=0,maior=0,soma=0;
		System.out.println("Digite quantos valores vão entrar: ");
		int maximo = input.nextInt();
		
		for(int i=1;i<=maximo;i++) {
			double numero = input.nextDouble();
			if(numero > 0 && numero <=1000) {
				soma+=numero;
				if(i == 1) {
					maior=numero;
					menor=numero;
				}
				if(numero > maior) {
					maior=numero;
				}
				else if(numero <= menor) {
					menor=numero;
				}
				
			}
			
			
			else {
				System.out.println("Número inválido, tente novamente!");
			}
							
		}
		System.out.println("Maior número digitado: " + maior);
		System.out.println("Menor número digitado: " + menor);
		System.out.println("A soma entre eles: " + soma);
	}

}
