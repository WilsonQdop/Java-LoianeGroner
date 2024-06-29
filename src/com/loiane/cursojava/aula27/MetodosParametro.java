package com.loiane.cursojava.aula27;

public class MetodosParametro {
	
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
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
