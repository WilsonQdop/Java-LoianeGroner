package com.loiane.cursojava.aula19.aula33;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MinhaCalculadora calculadora = new MinhaCalculadora();

        // Somar  todos os números de uma classe de vetor
        int[] vetoresInteiros = new int[5];
        for(int i = 0; i < vetoresInteiros.length; i++) {
           vetoresInteiros[i] = input.nextInt();
        }
        int resultado = calculadora.soma(vetoresInteiros);
        System.out.println(resultado);
    }
}
