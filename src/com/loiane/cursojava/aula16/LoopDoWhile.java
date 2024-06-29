package com.loiane.cursojava.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {
		int i=1;
		int max=10;
		
		
		//While primeiro avaliar a expressão depois executa o bloco de código;
		while(i <= max) {
			System.out.println("O " + i + " número.");
			i++;
		}
		
		System.out.println(i);
		
		//Do While primeiro executa o bloco para depois avaliar a expressão
		do  {
			System.out.println("Números atualizados: " + i);
			i++;
		}
		while(i < 20);
		
		System.out.println(i);

	}

}
