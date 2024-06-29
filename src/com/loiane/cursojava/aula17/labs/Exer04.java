package com.loiane.cursojava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		double a = 80000;
		double b =  200000;
		int qtAnos=0;
		
		while(a<=b) {
		
			a = a + a*0.03;
			
			b= b + b*0.015;
			qtAnos=qtAnos+1	;
			
			
		}
		
		System.out.println(qtAnos);
		
		
 	}

}
