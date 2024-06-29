package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double areaDoCirculo;
        System.out.println("Entre com um raio de um circulo: ");
        double raio = input.nextDouble();

        areaDoCirculo = Math.PI * (raio*raio);

        System.out.printf("A área do circulo é: %.2f", areaDoCirculo);

    }
}
