package com.loiane.cursojava.aula19.aula33.labs.main;

import com.loiane.cursojava.aula19.aula33.labs.objetos.Lampada;

public class Exer01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.desligado();
        lampada.mostrarEstados();
        lampada.mudarEstado();
        lampada.mostrarEstados();
    }



}
