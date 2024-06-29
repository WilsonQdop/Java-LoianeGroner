package com.loiane.cursojava.aula27;

import com.loiane.cursojava.aula26.MetodoRetorno;

public class MetodosParametrosTeste {

	public static void main(String[] args) {
		
		MetodosParametro carro = new MetodosParametro();

		carro.marca = "Fiat";
		carro.modelo = "Ducato";
		carro.numPassageiros = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		double qtdCombustivel = carro.calcularCombustivel(10);
		System.out.println(qtdCombustivel);
		
		double autonomia = carro.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);

	}

}
