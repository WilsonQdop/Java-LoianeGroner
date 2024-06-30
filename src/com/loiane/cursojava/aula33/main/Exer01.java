package com.loiane.cursojava.aula33.main;

import com.loiane.cursojava.aula33.objetos.Lampada;

public class Exer01 {
    public static void main(String[] args){

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
