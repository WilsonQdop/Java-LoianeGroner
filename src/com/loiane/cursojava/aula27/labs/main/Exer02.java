package com.loiane.cursojava.aula27.labs.main;

import com.loiane.cursojava.aula27.labs.objetos.ContaCorrente;

public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.saldo = 400;
		conta.limiteSaldo = 500;
		conta.verificarStatus();
		conta.saldoEspecial(12);
		conta.sacar(100);

	}

}
