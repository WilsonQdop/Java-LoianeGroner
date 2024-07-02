package com.loiane.cursojava.aula35.main;

import com.loiane.cursojava.aula35.objeto.Fibonacci;

public class Exer01 {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++ ) {
            System.out.print(Fibonacci.obterFibonacci(i) + " ");
        }

    }
}
