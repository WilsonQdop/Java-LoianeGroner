package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String output = "";
		int tabuada = 1;

		System.out.println("Quer fazer a tabuada de qual número? ");
		int numero = input.nextInt();
		output += "Tabuada de " + numero + "\n";
		
		System.out.println("Começar por onde? ");
		int comeco = input.nextInt();
		output += "Começo: " + comeco + "\n";
		
		System.out.println("terminar por onde? ");
		int termino = input.nextInt();
		output += "Termino: " + termino + "\n";
		
		System.out.println(output);

		for (int i = comeco; i <= termino; i++) {

			if (termino < comeco) {
				System.out.println("O termino não pode ser menor que o começo");
				input.close();
				return;
			} else {
				tabuada = numero * i;
				System.out.println(numero + " x " + i + " = " + tabuada);
			}
		}

	}

}
