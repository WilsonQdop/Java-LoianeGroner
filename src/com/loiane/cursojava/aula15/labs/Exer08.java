package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nome do primeiro Produto: ");
		String primeiroNome = input.next();
		System.out.println("Entre com o valor do primeiro produto: ");
		double primeiroProduto = input.nextDouble();
		
		System.out.println("Nome do segundo Produto: ");
		String segundoNome = input.next();
		System.out.println("Entre com o valor do segundo produto: ");
		double segundoProduto = input.nextDouble();
		
		System.out.println("Nome do primeiro Produto: ");
		String terceiroNome = input.next();
		System.out.println("Entre com o valor do terceiro produto: ");
		double terceiroProduto = input.nextDouble();
		
		double menorPreco=0;
		
		if(primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			menorPreco = primeiroProduto;
			System.out.printf("Você deve comprar o produto %s, pois custa %.2f e é o mais barato.", primeiroNome, menorPreco);
		}
		
		if(segundoProduto < primeiroProduto && segundoProduto < terceiroProduto) {
			menorPreco = segundoProduto;
			System.out.printf("Você deve comprar o produto %s, pois custa %.2f e é o mais barato.", segundoNome, menorPreco);
		}
		
		if(terceiroProduto < primeiroProduto && terceiroProduto < segundoProduto) {
			menorPreco = terceiroProduto;
			System.out.printf("Você deve comprar o produto %s, pois custa %.2f e é o mais barato.", terceiroNome, menorPreco);
		}
		
		
	}

}
