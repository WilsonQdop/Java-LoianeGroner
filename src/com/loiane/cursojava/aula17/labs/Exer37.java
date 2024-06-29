package com.loiane.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual é o salário inicial do funcionário? ");
		double salario = input.nextDouble();
		double percentual = 0.015;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997; i <= 2024; i++) {
			percentual*= 2;
			salario += (salario * percentual);
			System.out.println(i + " = " + format.format(salario) + " - " + format.format(percentual) + "%" );
		}
		
		

	}

}
