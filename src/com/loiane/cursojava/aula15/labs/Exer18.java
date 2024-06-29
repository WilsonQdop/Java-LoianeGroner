package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um ano: ");
		int ano = input.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.printf("Ano %d é bissexto", ano);
		}
		else {
			System.out.printf("Ano %d não é bissexto", ano);
		}
	}
}
