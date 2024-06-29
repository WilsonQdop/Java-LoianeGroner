package com.loiane.cursojava.aula26;


public class MetodoRetorno {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km/H");
	}
	
	double obterAutonomia() {
		System.out.println("Metodo obter autonomia foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}
}
