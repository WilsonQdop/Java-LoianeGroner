package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double precoKgMorango=0;
		double precoKgMaca=0;
		
			
		System.out.println("Quantos quilôgramas de maça? ");
		double qtMaca = input.nextDouble();
		
		System.out.println("Quantos quilôgramas de morango? ");
		double qtMorango = input.nextDouble();	
	
		if(qtMorango <= 5) {
			precoKgMorango = 2.5;
			
		}
		else {
			precoKgMorango = 2.2;
			
		}
		
		 if(qtMaca <=5) {
			precoKgMaca = 1.8;
			
		}
		else  {
			precoKgMaca = 1.5;
			
		}
		 
		double precoTotalMorango = precoKgMorango * qtMorango;
		double  precoTotalMaca = precoKgMaca * qtMaca;
		double totalParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = totalParcial;
		 
		 if((qtMorango + qtMaca > 8) || (totalParcial > 25)) {
			precoTotal = totalParcial - (totalParcial * 0.10);
			
		 }
		 
		 System.out.println("Preco total: " + precoTotal);
	}
}
