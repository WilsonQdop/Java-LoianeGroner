package com.loiane.cursojava.aula15.labs;
import  java.util.Scanner;

public class Exe21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o saque entre 10 a 6000: ");
		int saque = input.nextInt();
		
		if(saque < 10 || saque > 6000) {
			System.out.println("Você não pode sacar esta quantia.");
			input.close();
			return;
		}
		
		int notas1000 = saque / 1000;
		int notas100 = (saque % 1000)/100;
		int notas50 = ((saque %1000) %100) / 50;
		int notas10 = (((saque% 1000) %100) %50)/ 10;
		int notas5 = ((((saque % 1000) %100) %50) %10)/ 5;
		int notas1 = (((((saque %10000) %100) %50) %10) % 5)/ 1;
				
		
		if(notas1000 > 0 ) {
			System.out.println(notas1000 + " nota(s) de 1000 reais");
		}
		if(notas100 > 0) {
			System.out.println(notas100 + " nota(s) de 100 reais");
		}
		if (notas50 > 0) {
			System.out.println(notas50 + " nota(s) de 50 reais");
		}
		if(notas10 > 0) {
			System.out.println(notas10 + " nota(s) de 10 reais");
		}
		if(notas5 > 0) {
			System.out.println(notas5 + " nota(s) de 5 reais");
		}
		if(notas1 > 0) {
			System.out.println(notas1 + " nota(s) de 1 reais");
		}
 	}
}
