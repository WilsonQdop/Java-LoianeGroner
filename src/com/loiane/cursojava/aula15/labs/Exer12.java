package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o valor do seu trabalho por hora? ");
		double valorHora = input.nextDouble();
		
		System.out.println("Quantas horas você trabalha ao mês? ? ");
		double horaTrabalhadas = input.nextDouble();
		
		double salarioBruto = valorHora * horaTrabalhadas;
		
		double IR=0;
		
		if(salarioBruto <= 900) {
			IR=0;
		}
		else if (salarioBruto > 900 && salarioBruto <= 1500) {
			IR=5;
		}
		else if(salarioBruto > 1500 && salarioBruto <=2500) {
			IR=20;
		}
		else {
			IR=25;
		}
		
		double descontoIR = (salarioBruto/100) * IR;
		double Inss = salarioBruto * 0.10 ;
		double Fgts = (salarioBruto/100) * 11;
		double descontoTotal = descontoIR + Inss;
		double salarioLiquido = salarioBruto - descontoTotal;
		System.out.printf("\nSalário bruto: %.2f ", salarioBruto); 
		
		System.out.println("\n-----------Descontos-----------");
		System.out.printf("\nDesconto do IR: %.2f ", descontoIR);
		System.out.println("\nDesconto total do Inss " + Inss);
		System.out.println("FGTS pago pela empresa: " + Fgts);
		
		System.out.printf("\nSalário liquido no fim do mês: %.2f ",salarioLiquido );
	}
}
