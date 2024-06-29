package com.loiane.cursojava.aula19;

public class arrays {

	public static void main(String[] args) {
		double[] temperaturaDiaria = new double[365];
		temperaturaDiaria[0] = 31.3;
		int media = 0, soma = 0;
		for(double temperaturas : temperaturaDiaria) {
			soma += temperaturas;
			media = 2323 / soma;
			System.out.println(temperaturas);
		}
		System.out.println(soma);
		System.out.println(media);
		System.out.println(temperaturaDiaria.length);
		
		
	}

}
