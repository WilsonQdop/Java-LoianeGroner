package com.loiane.cursojava.aula35.objeto;

public class Fibonacci {
   public static int obterFibonacci(int num) {

       if(num < 2) {
           return 1;
       }
       return obterFibonacci(num - 1)  + obterFibonacci(num - 2);
   }
}
