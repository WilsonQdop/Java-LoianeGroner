package com.loiane.cursojava.aula35.objeto;

public class Somatorio {
    public static int somar(int numero) {
        if(numero == 0) {
            return 0;
        }
        return numero + somar(numero - 1);
    }
    public static int subtrair(int numero) {
        if(numero == 0) {
            return 0;
        }
        return numero - subtrair(numero - 1);
    }
}
