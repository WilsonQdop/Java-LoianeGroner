package com.loiane.cursojava.aula36.labs.objetos;

import com.loiane.cursojava.aula36.Contato;

public class Agenda {
    private Contato[] contatos;
    private String nome;

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
