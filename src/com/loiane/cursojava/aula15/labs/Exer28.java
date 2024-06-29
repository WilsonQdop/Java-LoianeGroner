package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double precoKg=0;
		double valorDesconto=0;	
		
		System.out.println("Qual tipo de carne você deseja levar? (file - picanha - alcatra)");
		String tipoCarne = input.next();
		
		System.out.println("Quantos kg's você deseja? ");
		double qtd = input.nextDouble();
		
		if(tipoCarne.equalsIgnoreCase("File")) {			
			if(qtd <= 5) {
				precoKg = 4.9;
			}
			else {
				precoKg = 5.8;
			} 		
		}
		if(tipoCarne.equalsIgnoreCase("Picanha")) {			
			 if(qtd <= 5){
				 precoKg = 6.9;
			 }
			 else {
				 precoKg = 7.8;
			 }			 
		}
		if(tipoCarne.equalsIgnoreCase("Alcatra")) {
		
		 if(qtd <= 5){
			 precoKg = 5.9;
		 }
		 else {
			 precoKg = 6.8;
		 }		 
		}
		double precoDaCompra = precoKg * qtd;
		
		System.out.println("Deseja comprar pelo tabajaraCard? ");
		String cartao = input.next();
		
		if(cartao.equalsIgnoreCase("sim")) {
			valorDesconto = (precoDaCompra/100) * 5;
		}
		else  {
			valorDesconto = 0;
		}
		double precoTotal = precoDaCompra - valorDesconto;
		
		
		
		System.out.println("--------- Nota Fiscal ---------");
		System.out.println("Qual o tipo de carne? " + tipoCarne);
		System.out.printf("Qual a quantidade? %.1f\n",qtd);
		System.out.printf("Preço da compra: %.2f\n", precoDaCompra);
		System.out.println("Tipo de pagamento: " + cartao);
		System.out.printf("Valor do desconto em reais %.2f\n", valorDesconto );
		System.out.printf("Preço total: %.2f\n", precoTotal );
		
			
		
	}
}
