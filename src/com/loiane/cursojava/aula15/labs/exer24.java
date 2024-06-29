package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class exer24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double resultado=0;
		
		
		
		System.out.println("Digite o primeiro número: ");
		double numeroUm = input.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numeroDois = input.nextDouble();
		
		System.out.println("Qual operação você deseja realizar? ( +, -, *, ou /) ");
		String operacao = input.next();
		
		
		
		switch(operacao) {
		case "+":	
			resultado = numeroUm + numeroDois;
			break;
		case "-":
			resultado = numeroUm - numeroDois;
			break;
		case "*":
			resultado = numeroUm * numeroDois;
			break;
		case "/":
			resultado = numeroUm / numeroDois;
			break;
		default:
			System.out.println("Operação inválida");
		}
		
		
		if(resultado % 2 ==0) {
			System.out.printf("%.2f é par\n", resultado);
		}
		else {
			System.out.printf("%.2f é impar\n", resultado);
		}
		
		if(resultado >= 0) {
			System.out.printf("%.2f é positivo\n", resultado);
		}
		else {
			System.out.printf("%.2f é negativo\n", resultado);
		}
		if(resultado == Math.round(resultado)) {
			System.out.printf("%.2f é inteiro\n", resultado);
		}
		else {
			System.out.printf("%.2f é decimal\n", resultado);
		}
	}

}
