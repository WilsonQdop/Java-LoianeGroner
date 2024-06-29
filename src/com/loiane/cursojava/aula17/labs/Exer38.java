package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer38 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codigo;
		double altura;
		double maior = 0, menor = 0;
		int maiorCodigo = 0, menorCodigo = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o código do " + (i+1) + " aluno: ");
			codigo = input.nextInt();
			System.out.println("Informe a altura do " + (i+1) + " aluno: ");
			altura = input.nextDouble();
			
			if(i == 0) {
				maior = altura;
				menor = altura;
				maiorCodigo = codigo;
				menorCodigo = codigo;
			}
			if(altura > maior) {
				maior = altura;
				maiorCodigo = codigo;
			}
			else if(altura < menor) {
				menor = altura;
				menorCodigo = codigo;
			}
		}
		System.out.printf("O maior aluno tem o código %d, tem exatamente %.2f metros \n", maiorCodigo, maior );
		System.out.printf("O menor aluno tem o código %d, tem exatamente %.2f metros \n", menorCodigo, menor );
	}

}
