package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double primeiroNumero = input.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double segundoNumero = input.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		double terceiroNumero = input.nextDouble();
		
		
			
		if(primeiroNumero <= segundoNumero && primeiroNumero <= segundoNumero && segundoNumero <= terceiroNumero) {
			System.out.println(terceiroNumero + " - " + segundoNumero + " - " + primeiroNumero);
		}
			else if(primeiroNumero <= segundoNumero && primeiroNumero <= segundoNumero && terceiroNumero <= segundoNumero) {
				System.out.println(segundoNumero + " - " + terceiroNumero + " - " + primeiroNumero);
			}
		
			else if(segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero && terceiroNumero <= primeiroNumero) {
				System.out.println(primeiroNumero + " - " + terceiroNumero + " - " + segundoNumero);
			}
			else if(segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero && primeiroNumero <= primeiroNumero) {
				System.out.println(terceiroNumero + " - " + primeiroNumero + " - " + segundoNumero);
			}
		
			else if(terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero && segundoNumero <= primeiroNumero) {
				System.out.println(primeiroNumero + " - " + segundoNumero + " - " + terceiroNumero);
			}
			else if(terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero && primeiroNumero <= segundoNumero) {
				System.out.println(segundoNumero + " - " + primeiroNumero + " - " + terceiroNumero);
			}
		
		
		
	}
}
