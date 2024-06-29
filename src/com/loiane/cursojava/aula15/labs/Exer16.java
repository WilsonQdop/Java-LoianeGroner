package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;


public class Exer16 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		boolean verificador = false;
		
		
		System.out.println("Informe  o valor do A: ");
		double a = input.nextDouble();
		
		if(a == 0) {
			System.out.println("O valor de A não pode ser igual a 0");
			input.close();
			return;
		}
		System.out.println("Informe  o valor do B: ");	
		double b = input.nextDouble();
	
		System.out.println("Informe  o valor do C: ");
		double c = input.nextDouble();			
			
			double delta = Math.pow(b, 2) -4*a*c;
			System.out.println("O valor do delta: " + delta);
		if(a > 0) {
			if(delta >= 1) {
				
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				
				System.out.println("Valor da raiz positiva: "+ x1);
				System.out.println("Valor da raiz negativa: "+ x2);
			}
			else if(delta == 0) {
				
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				
				System.out.println("Seu delta é " + delta + " consecutivamente gerando só uma raiz real.");
				System.out.println("Valor da raiz: " + x1);
			}
			else if(delta < 0) {
				
				System.out.println("Seu delta é " + delta + ", consecutivamente não existindo raízes reais.");
				input.close();
				return;
			}			
		}
			
	}	

}
