package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean primo;
		
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
			
		for(int i = 1; i <= numero; i++) {
			primo = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					primo = false;
					
				}
			}
			if(primo) {
			System.out.println(i);
			}
		}
	}

}
