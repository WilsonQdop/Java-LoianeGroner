package com.loiane.cursojava.aula34;

public class MinhaCalculadora {
    public static int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
    public static int somar(int numeroUm, int numeroDois, int numeroTres) {
        return numeroUm + numeroDois + numeroTres;
    }
    public static double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }
    public static int somarInteiros(int[] vetorInteiros) {
        int total = 0;

        for(int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}
