package com.loiane.cursojava.aula36;

public class Telefone {
    private String operadora;
    private String ddd;
    private String numero;

    public Telefone(String operadora, String ddd, String numero) {
        this.operadora = operadora;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
