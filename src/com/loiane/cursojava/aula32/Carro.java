package com.loiane.cursojava.aula32;

public class Carro {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    //Métodos Getters;
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getNumPassageiros() {
        return this.numPassageiros;
    }
    public double getCapCombustivel() {
        return this.capCombustivel;
    }
    public double getConsumoCombustivel() {
        return this.consumoCombustivel;
    }
    //Métodos Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }
    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }


}
