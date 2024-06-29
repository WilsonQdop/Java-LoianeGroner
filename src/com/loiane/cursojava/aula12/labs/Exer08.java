package com.loiane.cursojava.aula12.labs;

public class Exer08 {
    public static void main(String[] args) {
        double pesoPeixe = 60;
        double excesso = pesoPeixe - 50;
        int multa=4;


        if(pesoPeixe > 50) {
            double multaTotal = excesso * multa;
            System.out.printf("O peso do peixe teve um excesso de %.2f quilos. A multa que você irá pagar é: %.2f ", excesso, multaTotal);
        }
        else {
            System.out.println("Está abaixo ou no peso ideal");
        }

    }
}
