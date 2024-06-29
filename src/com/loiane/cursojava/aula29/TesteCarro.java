package com.loiane.cursojava.aula29;

import com.loiane.cursojava.aula27.MetodosParametro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        Carro van2 = new Carro("Fiat");
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van2.modelo = "Ducato";
        System.out.println(van2.marca);

    }
}
