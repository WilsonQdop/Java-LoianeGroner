package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double primeiroNumero = input.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double segundoNumero = input.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		double terceiroNumero = input.nextDouble();
		
		double maiorNumero=primeiroNumero;
		if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			maiorNumero = segundoNumero;
		}
		if(terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			maiorNumero = terceiroNumero;
		}
		//Verificar o menor numero;
		
		double menorNumero = primeiroNumero;
		if(segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
			menorNumero = segundoNumero;
		}
		if(terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
			menorNumero = terceiroNumero;
		}
		
		System.out.printf("\nO maior número entre eles é: %.1f ", maiorNumero);
		System.out.printf("\nO menor número entre eles é: %.1f ", menorNumero);
	}
}
