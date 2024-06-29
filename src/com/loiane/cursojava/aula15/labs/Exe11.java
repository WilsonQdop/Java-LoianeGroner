	package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;
	
public class Exe11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com seu salário atual: ");
		double salario = input.nextDouble();
		
		int percentual=0;
		
		
		if(salario <= 280) {
			percentual=20;
			
		}
		else if(salario > 280 && salario <= 700) {
			percentual = 15;
		}
		else if(salario > 700 && salario <= 1500) {
			percentual = 10;
		}
		else {
			percentual = 5;
		}
				
		double aumentoSalarial = (salario / 100) * percentual;
		double salarioAtualizado = salario + aumentoSalarial;
		
		System.out.printf("\nSeu salário antes do reajuste: %.2f ", salario);
		System.out.printf("\nVocê teve um percentual de aumento de: %d ",percentual);
		System.out.printf("\nSalário depois do aumento: %.2f ", aumentoSalarial);
		System.out.printf("\nSalário atualizado após o aumento: %.2f ", salarioAtualizado);
		

	}

}
