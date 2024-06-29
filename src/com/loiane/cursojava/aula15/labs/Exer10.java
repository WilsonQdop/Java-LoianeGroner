package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Em qual periodo você estuda? (M /V /N)");
		String periodo = input.next();
		
		switch(periodo) {
			case "M":
				System.out.println("Bom dia.");
				break;
			case "V":
				System.out.println("Boa tarde.");
				break;
			case "N":
				System.out.println("Boa noite.");
				break;
			default:
				System.out.println("Valor inválido.");
		}
	}
}
