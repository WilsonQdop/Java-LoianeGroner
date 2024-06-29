package com.loiane.cursojava.aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    public Carro() { }


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
