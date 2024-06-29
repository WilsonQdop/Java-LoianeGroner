package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			double valorAlcool = 1.9, valorGasolina=2.5, desconto=0;
			int qtAlcool=0, qtGasolina=0;
			double total=0,totalDesconto=0;
			
		System.out.println("Escolha o seu tipo de combustível (A-alcool ou G-gasolina)");
		String tipoCombustivel = input.next();
		
		
		
		if(tipoCombustivel.equalsIgnoreCase("a")) {
			System.out.println("Quantos litros de alcool? ");
			qtAlcool = input.nextInt();
			if(qtAlcool <= 20) {
				desconto = 3;
			}
			else if(qtAlcool > 20) {
				desconto = 5;
			}
			total = qtAlcool * valorAlcool;
		}
		else if(tipoCombustivel.equalsIgnoreCase("g")) {
			System.out.println("Quantos litros de gasolina? ");	
			qtGasolina = input.nextInt();
			if(qtGasolina <= 20) {
				desconto = 4;
			}
			else if(qtGasolina > 20) {
				desconto = 6;
			}
			total = qtGasolina* valorGasolina;
		}	
		
			totalDesconto = (total/100) * desconto;	
			double precoAPagar = total - totalDesconto;
			
			System.out.println("Valor a ser pago: " + precoAPagar);
		
	}
}
