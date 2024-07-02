package com.loiane.cursojava.aula34.labs.main;

import com.loiane.cursojava.aula34.labs.objetos.Contador;

public class Exer01 {
    public static void main(String[] args) {
        System.out.println(Contador.retornarValor());
        Contador.incrementarSoma();
        Contador.incrementarSoma();
        System.out.println(Contador.retornarValor());
        Contador.zerarSoma();
        System.out.println(Contador.retornarValor());

    }
}
