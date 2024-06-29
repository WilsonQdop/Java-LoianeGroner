package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto R$ você ganha por hora? ");
        double ganhosHora = input.nextDouble();

        System.out.println("E quantas horas você trabalhou no mês? ");
        double horasMes = input.nextDouble();

        double salarioMensal = ganhosHora * horasMes;

        System.out.printf("Você ganhou o equivalente a: %.2f R$ ", salarioMensal);

    }
}
