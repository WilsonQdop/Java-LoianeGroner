package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto você recebe por hora? ");
        double salarioHora = input.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasMensal = input.nextDouble();

        double salarioBruto = salarioHora * horasMensal;
        double descontoImposto =   (salarioBruto * 0.11);
        double descontoInss = salarioBruto * 0.08;
        double descontoSindicato = salarioBruto * 0.05;
        double descontos = descontoImposto + descontoInss + descontoSindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("\nSalário bruto: %.2f", salarioBruto);
        System.out.printf("\nDesconto do Imposto de Renda: %.2f ", descontoImposto);
        System.out.printf("\nDesconto do INSS: %.2f ", descontoInss);
        System.out.printf("\nDesconto do sindicato: %.2f ", descontoSindicato);
        System.out.printf("\nO preço liquido depois de pagar as contas: %.2f ", salarioLiquido);

    }
}
