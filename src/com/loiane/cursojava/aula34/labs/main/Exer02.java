package com.loiane.cursojava.aula34.labs.main;

import com.loiane.cursojava.aula34.labs.objetos.Calculadora;

public class Exer02 {
    public static void main(String[] args) {

        imprimirResult((Calculadora.multiplicar(2,4)));
        imprimirResult((Calculadora.dividir(10, 2)));
        imprimirResult((Calculadora.subtrair(10, 2)));
        imprimirResult((Calculadora.somar(10, 10)));
        imprimirResult((Calculadora.potenciar(7,2)));

    }
    public static void imprimirResult(double numero) {
        System.out.println(numero);
    }
}
