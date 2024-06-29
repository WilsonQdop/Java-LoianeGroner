package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1=1;
		int n2=1;
		int n3=0;
	
		for(int i=0; n3<=500;i++) {
			
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
			
			System.out.println(n3);
		}
		
	}

}
