package com.loiane.cursojava.aula19.aula33;

public class MinhaCalculadora {

    public int soma(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
    public double soma(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }
    public int soma(int numeroUm, int numeroDois, int numeroTres){
        return numeroUm + numeroDois + numeroTres;
    }
    public int soma(int[] vetoresInteiros) {
        int total = 0;
        for(int i = 0; i < vetoresInteiros.length; i++) {
            total+= vetoresInteiros[i];
        }
        return total;
    }
}
