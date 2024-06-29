package com.loiane.cursojava.aula24.labs.main;

import com.loiane.cursojava.aula24.labs.objetos.ContaCorrente;

public class Exer05 {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "111-2222-444.09";
		conta.agencia = "Nubank";
		conta.saldo = 250;
		conta.especial = true;
		conta.limiteEspecial = 1200;
		conta.limiteSaldo = 1000;
		 
		if(conta.especial) {
			System.out.println("Você tem um limite de " + conta.limiteEspecial);
		}
		else {
			System.out.println("Você possui um limite normal de " + conta.limiteSaldo);
		}
		
		System.out.println(conta.numero);
	}
}
