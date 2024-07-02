package com.loiane.cursojava.aula34.labs.objetos;

public class Contador {
    private static int cont;

    public static void incrementarSoma() {
       cont++;
    }
    public static void zerarSoma() {
        cont = 0;
    }
    public static int retornarValor()  {
        return cont;
    }

}
