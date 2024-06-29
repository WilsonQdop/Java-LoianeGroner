package com.loiane.cursojava.aula26;

public class MetodoRetornoTeste {

	public static void main(String[] args) {

		MetodoRetorno carro = new MetodoRetorno();
		
		carro.marca = "Fiat";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;	
		double autonomia = carro.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);

	}

}
