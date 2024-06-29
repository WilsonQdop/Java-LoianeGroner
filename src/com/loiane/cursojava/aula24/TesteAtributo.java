package com.loiane.cursojava.aula24;

public class TesteAtributo {

	public static void main(String[] args) {
		
		Atributos carro = new Atributos();
		carro.marca = "Fiat";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		System.out.println(carro.modelo);
		System.out.println(carro.marca);
		
		
		Atributos fusca = new Atributos();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}
