package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boolean triangulo = false;
		
		while(!triangulo) {
			System.out.print("Informe o primeiro lado do triângulo: ");
			double lado1 = input.nextDouble();
			
			System.out.print("Informe o segundo lado do triângulo: ");
			double lado2 = input.nextDouble();
			
			System.out.print("		Informe o terceiro lado do triângulo: ");
			double lado3 = input.nextDouble();
			
		if((lado1 + lado2 > lado3) || (lado2 + lado3 > lado1) || (lado1 + lado3 > lado2)) {
			triangulo = true;
			
			System.out.println("Podem formar um triângulo? " + triangulo);	
			
			if((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {		
				System.out.println("Triângulo Escaleno.");
			}
			else if((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)){
				System.out.println("Triângulo Equilátero");
			}
			else {
				System.out.println("Triângulo Isósceles");
			}
		}
			
		else {
			System.out.print("\nNão forma triângulo.");
		}
		}
	
		
	}
}
