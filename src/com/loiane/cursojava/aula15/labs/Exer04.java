package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um caracter.");
		String caracter = input.next();
		
		//if(caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i") || caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u")) {
		//	System.out.println("Caracter digitado é uma vogal.");
		//}
		//else {
			//System.out.println("Caracter digitado é um consoante");
		//}
		
		//Ou usando o switch-case junto com o If-else
		
		if(caracter.length() > 1) {
			System.out.println("Não é uma letra válida.");
		}
		else {
			switch(caracter) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
					System.out.println("É vogal");
					break;
				default:
					System.out.println("É consoante");
			}
		}
	}
}
