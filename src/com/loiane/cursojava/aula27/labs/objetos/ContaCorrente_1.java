package com.loiane.cursojava.aula27.labs.objetos;

public class ContaCorrente_1 {
	public int numero;
	public double saldo;
	public boolean status;
	public double  limiteSaldo;
	public double valorEspecial;
	
	
	public boolean realizarSaque(double qtdSaque) {
		
		// Tem saldo na conta	
		if(saldo >= qtdSaque) {
			saldo -= qtdSaque;
			return true;
		} else {
			if(status) {
				double limite = limiteSaldo + saldo;			
				if(limite > qtdSaque) {
					saldo -= qtdSaque;
					return true;
				} else {
					return false;
				}
			} else {
				return false; // Não é especial;
			}
		}	
	}
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta " + saldo);
	}
	public boolean verificarStatus() {
		return saldo < 0;
			
	}
}
