package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		boolean palindromo = true;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe os números " + i +": " );
			numeros[i] = input.nextInt();
			if(numeros[i] != numeros[numeros.length - 1 - i]) {
				palindromo = false;
							
			}
			
		}
  		  		
  		if(palindromo) {
  			System.out.println("palindromo");
  		}
  		else {
  			System.out.println("Não é palindromo");
  		}

	}

}
