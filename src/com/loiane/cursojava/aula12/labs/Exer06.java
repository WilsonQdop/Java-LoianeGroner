package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = input.nextDouble();

        double pesoIdeal = (72.7 * altura) -58;

        System.out.printf("A sua faixa ideal de peso é: %.2f ", pesoIdeal);
    }

}
