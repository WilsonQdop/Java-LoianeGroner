package com.loiane.cursojava.aula19.aula33.labs.main;

import com.loiane.cursojava.aula19.aula33.labs.objetos.ContaCorrente;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta(123456);
        conta.setLimiteSaldo(500    );
        conta.setStatus(true);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumeroConta() + " = " + conta.getSaldo());

        boolean realizarSaque = conta.realizarSaque(10);
        if(realizarSaque) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar o saque. Tente novamente!");
        }

        realizarSaque = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if(realizarSaque) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar o saque. Tente novamente!");
        }

        System.out.println("Deposito de 500 reais");
        conta.realizarDeposito(500);
        conta.consultarSaldo();

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if(conta.consultarUsoChequeEspecial()) {
            System.out.println("Está utilizando cheque especial");
        } else {
            System.out.println("Não está utilizando cheque especial");
        }
    }
}
