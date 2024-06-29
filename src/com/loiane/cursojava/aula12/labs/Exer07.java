package com.loiane.cursojava.aula12.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Informe o seu sexo: ");
        String sexo = input.next();

        System.out.println("Informe a sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Informe o seu peso: ");
        double peso = input.nextDouble();



        double pesoIdealM = (72.7*altura) - 58;
        double pesoIdealF = (62.1*altura) - 44.7;

        if(sexo.equalsIgnoreCase("m")) {
            if (peso == pesoIdealM ){
                System.out.println("Você é homem e está no peso ideal");
            }
            else if(peso > pesoIdealM){
                System.out.println("Você é homem e está acima do peso");
            }
            else {
                System.out.println("Você é homem e está abaixo do peso");
            }
        }



        if(sexo.equalsIgnoreCase("f")) {
            if(peso == pesoIdealF) {
                System.out.println("Você é mulher e está no peso ideal");
            }
            else if(peso > pesoIdealF){
                System.out.println("Você é mulher e está acimia do peso");
            }
            else {
                System.out.println("Você é mulher e está acimia do peso");
            }
        }
    }
}
