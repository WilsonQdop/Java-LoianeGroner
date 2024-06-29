package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a temperatura em Farenheit? ");
        double farenheit = input.nextDouble();

        double celcius = 5 * (farenheit - 32) /9;

        System.out.printf("A temperatura %.2f farenheit é equivalente a %.2f celcius. ", farenheit, celcius);

    }
}
