package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class exer36 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		boolean verificador = true;
		
		int codigo, cont = 0;
		double altura, peso;
		double maiorAltura = 0,MenorAltura = 0, maisPesado = 0, menosPesado = 0, aux = 0;
		int maiorCodigo = 0, menorCodigo = 0;
		
		
		while(verificador) {
			
			System.out.println("Informe o seu código: ");
			codigo = input.nextInt();
			if(codigo > 0) {			
			System.out.println("Informe a sua altura: ");
			altura = input.nextDouble();
			System.out.println("Informe o seu peso: ");
			peso = input.nextDouble();
			cont++;
			if(cont == 1)  {
				maiorAltura = altura;
				MenorAltura = altura;
				maisPesado = peso;
				menosPesado = peso;
				maiorCodigo = codigo;
				menorCodigo = codigo;
			}
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
				maisPesado = peso;
				maiorCodigo = codigo;
			}
			if(altura < MenorAltura) {
				MenorAltura = altura;
				menosPesado = peso;
				menorCodigo = codigo;
			}
			}
			
			else {
				verificador = false;
			}
		}
		System.out.printf("A pessoa mais alta é a que tem o código %d, com %.2f de altura \n", maiorCodigo, maiorAltura);
		System.out.printf("A pessoa mais baixa é a que tem o código %d, com %.2f de altura \n", menorCodigo, MenorAltura);
		System.out.printf("A pessoa mais gorda é a que tem o código %d, com %.2f de peso \n", maiorCodigo, maisPesado);
		System.out.printf("A pessoa menos gorda é a que tem o código %d, com %.2f de peso \n", menorCodigo, menosPesado);

	}

}
