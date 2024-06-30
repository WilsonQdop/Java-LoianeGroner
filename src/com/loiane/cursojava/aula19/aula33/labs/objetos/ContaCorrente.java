package com.loiane.cursojava.aula19.aula33.labs.objetos;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    private boolean status;
    private double limiteSaldo;

    public ContaCorrente(int numeroConta, double saldo, boolean status, double limiteSaldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.status = status;
        this.limiteSaldo = limiteSaldo;
    }
    public ContaCorrente() { }

    public int getNumeroConta() {
        return this.numeroConta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public double getLimiteSaldo() {
        return this.limiteSaldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setLimiteSaldo(double limiteSaldo) {
        this.limiteSaldo = limiteSaldo;
    }

    public boolean realizarSaque(double saque) {

        if(getSaldo() >= saque) { // Saldo maior que saque
            saldo -= saque;
            return true;
        } else { // Saldo menor que o saque
            if(isStatus()) { // Verificar se o status é especial ou não
                double limite = saldo + limiteSaldo; // Se sim, incrementa o saldo + o limiteSaldo
                if(limite >= saque) { // Verificar se o limite é maior que o saque
                   saldo -= saque;
                    return true;
                } else { //Limite é menor que o saque;
                    return false;
                }
            } else {  // Não é saque especial
                return false;
        }
        }
    }
    public void realizarDeposito(double valorDepositado) {
        saldo += valorDepositado;
    }
    public void consultarSaldo() {
        System.out.println("Você possue " +  getSaldo() + " R$ em saldo.");
    }
    public boolean consultarUsoChequeEspecial() {
        return saldo < 0;
    }
 }
