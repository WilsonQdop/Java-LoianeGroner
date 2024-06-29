package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double primeiraNota = input.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double segundaNota = input.nextDouble();
		
		double media;
		media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 7 && media < 10) {
			System.out.println("Aluno aprovado.");
		}
		else if(media == 10) {
			System.out.println("Aprovado com distinção.");
		}
		else if(media < 7){
			System.out.println("Aluno reprovado.");
		}
	}

}
