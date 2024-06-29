package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu sexo: (F ou M): ");
		String sexo = input.next();
		
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		}		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		}
		else {
			System.out.println("Sexo inválido.");
		}
	}
}
