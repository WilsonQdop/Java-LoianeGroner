package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero=0, par=0, impar=0;
		for(int i=1; i<=10;i++) {
			numero = input.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Números pares: " + par);
		System.out.println("Números impares: " +  impar);
	}

}
