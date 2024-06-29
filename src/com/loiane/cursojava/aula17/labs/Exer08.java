package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma =0,media=0;
		int cont=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Informe o " + i + " número: ");
			double numero = input.nextDouble();
			
			
			soma+=numero;
			cont++;
			media = soma/cont;
		}
		System.out.printf("%.2f\n",soma);
		System.out.println(cont);
		System.out.println(media);

	}

}
