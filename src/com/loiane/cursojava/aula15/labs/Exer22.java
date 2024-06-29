package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double numero  = input.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.printf("%.1f é um número par. ", numero);
		}
		else {
			System.out.printf("%.1f é um número impar. ", numero);
		}
	}

}
