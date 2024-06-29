package com.loiane.cursojava.aula25;


public class MetodoSimplesTeste {

	public static void main(String[] args) {

		MetodosSimples carro = new MetodosSimples();
		carro.marca = "Fiat";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		carro.exibirAutonomia();

	}

}
