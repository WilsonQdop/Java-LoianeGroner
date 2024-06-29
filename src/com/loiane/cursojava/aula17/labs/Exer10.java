package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma=0;
		int numeroUm = input.nextInt();
		int numeroDois = input.nextInt();
		System.out.println("Intervalos de números: ");
		
		
		while(numeroUm>=numeroDois) {
		numeroUm--;
		soma+=numeroUm;
		System.out.println(numeroUm);
	}
		soma=0;
		
		while(numeroUm<numeroDois) {
			numeroUm++;
			soma+=numeroUm;
			System.out.println(numeroUm);	
	}
		
		System.out.println("soma: " + soma);
	}
}
