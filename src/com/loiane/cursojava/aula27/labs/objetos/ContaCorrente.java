package com.loiane.cursojava.aula27.labs.objetos;

import java.util.Scanner;

public class ContaCorrente {
	Scanner input = new Scanner(System.in);
	public int numero;
	public double saldo;
	public boolean status;
	public double  limiteSaldo;
	
	public void depositar(double deposito) {
		saldo += deposito;
		System.out.println("Você depositou " + deposito + " R$ na conta.");
	}
	public void sacar(double saque)  {
		
		if(saldo < limiteSaldo) {
			if(saldo != 0) {
				if(saldo >= saque) {
					saldo -= saque;
					System.out.println("Você realizou um saque de " + saque + ".\nSaldo restante = " + saldo);
				} else {
					System.out.println("Saldo insuficiente!");
				} 
			}
				else {
					System.out.println("Saldo negativado. Deseja adicionar o cheque especial? (1 - sim / 2 - não)");
					int opcao = input.nextInt();
					
					switch(opcao) {
					
					case 1:
						saldoEspecial(saldo);
						System.out.println("você tem um saldo de " + saldo + " Utilizando o cheque especial");
						break;
					case 2:
						input.close();
						return;
				}
			}
			
		} else {
			System.out.println("Ultrapassou o limite estabelecido");
			
		
				
		}
	
	}
	public void verificarStatus() {
		if(status) {
			System.out.println("Está usando cheque especial");
		}
		else {
			System.out.println("Está usando cheque normal");
		}
		
	}
	public void saldoEspecial(double chequeEspecial) {
		if(status) {
			saldo += chequeEspecial;
		}
		else {
			System.out.println("Não tem direito a chegue especial");
		}
		
	}

}
