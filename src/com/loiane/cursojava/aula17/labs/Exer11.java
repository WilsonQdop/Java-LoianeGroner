package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabuada=1;
		int numero = input.nextInt();
		System.out.println("Tabuada de " + numero + ":");
		
		for(int i=1;i<=10;i++) {
			tabuada = numero*i;
			System.out.println(numero + " x " + i + " = " + tabuada);
		}
	}

}
