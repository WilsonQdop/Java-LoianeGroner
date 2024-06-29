package com.loiane.cursojava.aula27.labs.main;

import com.loiane.cursojava.aula27.labs.objetos.ContaCorrente_1;

public class Exer02_1 {
	public static void main(String[] args) {
		ContaCorrente_1 conta = new ContaCorrente_1();
		
		conta.numero = 112209;
		conta.saldo = -10;
		conta.status = true;
		conta.limiteSaldo = 500;
		conta.valorEspecial = 0;
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}
		else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
		}
		 saqueEfetuado = conta.realizarSaque(500);
		 
		 if(saqueEfetuado) {
				System.out.println("Saque efetuado com sucesso");
				conta.consultarSaldo();
			}
			else {
				System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
			}
		
		 conta.depositar(500);
		 conta.consultarSaldo();
		 if(conta.verificarStatus()) {
			 System.out.println("Está usando cheque especial");
		 } else {
			 System.out.println("Não está usando cheque especial");
		 }
		 
		 conta.realizarSaque(600);
		 conta.consultarSaldo();
		 if(conta.verificarStatus()) {
			 System.out.println("Está usando cheque especial");
		 } else {
			 System.out.println("Não está usando cheque especial");
		 }
	}
}
