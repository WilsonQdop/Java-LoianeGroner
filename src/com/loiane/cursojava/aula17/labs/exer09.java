package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		for(int i=1;i<=numero;i++) {
			
			 
			 if(i % 2 !=0) {
				 System.out.println(i);
			 }
			 
			 
		}

	}

}
