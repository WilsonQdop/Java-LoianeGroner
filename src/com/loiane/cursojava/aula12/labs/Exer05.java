package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int inteiro1 = input.nextInt();

        System.out.println("Informe um outro número inteiro: ");
        int inteiro2 = input.nextInt();

        System.out.println("Informe um número real: ");
        float real1 = input.nextFloat();


        int a = (inteiro1 * 2) * (inteiro2/2);
        double b = (inteiro1*3) + real1;
        double c = Math.pow(real1, 3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
