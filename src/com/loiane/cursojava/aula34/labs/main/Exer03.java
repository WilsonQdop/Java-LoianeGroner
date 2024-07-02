package com.loiane.cursojava.aula34.labs.main;

import com.loiane.cursojava.aula34.labs.objetos.Calculadora2;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;

        imprimirResult((Calculadora2.multiplicar(2,4)));
        imprimirResult((Calculadora2.dividir(10, 2)));
        imprimirResult((Calculadora2.subtrair(10, 2)));
        imprimirResult((Calculadora2.somar(10, 10)));
        imprimirResult((Calculadora2.potenciar(7,2)));

        do {
           num = input.nextDouble();
           if(num < 0) {
               System.out.println("Número inválido! Tente novamente!");
           }

        }while(num < 0);
        imprimirResult((Calculadora2.fatorial(num)));


    }
    public static void imprimirResult(double numero) {
        System.out.println(numero);
    }
}
