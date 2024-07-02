package com.loiane.cursojava.aula34.labs.objetos;

public class Calculadora2 {
    public static double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }
    public static double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }
    public static double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }
    public static double dividir(double numeroUm, double numeroDois) {
        return numeroUm / numeroDois;
    }
    public static double potenciar(double numeroUm, double numeroDois) {
        double potencia = 1;

        for(int i = 1; i <= numeroDois; i++) {
            potencia *= numeroUm;
        }
        return potencia;
    }
    public static double fatorial(double numero) {

        if(numero == 0) {
            return 1;
        }

        return numero * fatorial(numero - 1);
    }
}
