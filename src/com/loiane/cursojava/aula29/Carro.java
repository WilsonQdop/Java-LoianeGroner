package com.loiane.cursojava.aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro() {
        System.out.println("Classe carro foi instanciada");
        numPassageiros = 4;
    }
    public Carro(String marca_) {
        marca = marca_;
    }
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km/H");
    }

    double obterAutonomia() {
        System.out.println("Metodo obter autonomia foi chamado. ");
        return capCombustivel * consumoCombustivel;
    }
    double calcularCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
