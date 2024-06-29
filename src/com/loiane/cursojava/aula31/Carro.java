package com.loiane.cursojava.aula31;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor 3 com 3 parâmetros");

    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtor 2 com 2 parâmetros");
    }


    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + obterAutonomia() + " Km/H");
    }

    public double obterAutonomia() {
        System.out.println("Metodo obter autonomia foi chamado. ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km) {
        return km/this.consumoCombustivel;
    }

  public double calcularCombustivel(double km) {
        double qtdCombustivel = divideKmPorConsumoCombustivel(10);
        return qtdCombustivel;
    }
}
