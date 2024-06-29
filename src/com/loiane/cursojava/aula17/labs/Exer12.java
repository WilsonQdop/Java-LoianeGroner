package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int base = input.nextInt();
		int expoente = input.nextInt();
		int resultado=1;
		
		for(int i=1;i<=expoente;i++) {
			 resultado *=base;
			
		}
		System.out.println(resultado);
		

	}

}
