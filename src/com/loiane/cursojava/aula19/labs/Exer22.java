package com.loiane.cursojava.aula19.labs;

public class Exer22 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		double porcZero = 0, porcUm = 0;
		int zero = 0, um = 0;
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random()* 1);
			if(numeros[i] == 0) {
				zero++;
			}
			else {
				um++;
			}
			porcZero = (zero * 100) / numeros.length;
			porcUm = (um * 100) / numeros.length;
		}
		for(int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Porcentagem de numeros 0: " + porcZero);
		System.out.println("Porcentagem de numeros 1: " + porcUm);
	}

}
