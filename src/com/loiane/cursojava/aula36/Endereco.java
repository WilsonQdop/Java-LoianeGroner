package com.loiane.cursojava.aula36;

public class Endereco {
    private String nomeRua;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private String numero;

    public Endereco(String nomeRua, String complemento, String cidade, String estado, String cep, String numero) {
        this.nomeRua = nomeRua;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroo() {
        return numero;
    }

    public void setNumeroo(String numeroo) {
        this.numero = numeroo;
    }
}
