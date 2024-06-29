package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int lata = 18;

        System.out.println("Informe os metros da parede, em metros quadrados: ");
        int metros = input.nextInt();

        double tintas = 1 * (metros/3);

        double totalTintas =  tintas * 80;
        System.out.println(totalTintas);

    }

}
