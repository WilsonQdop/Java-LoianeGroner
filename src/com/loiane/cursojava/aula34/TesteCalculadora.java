package com.loiane.cursojava.aula34;

import com.loiane.cursojava.aula34.MinhaCalculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MinhaCalculadora.somar(1,3);
        MinhaCalculadora.somar(1,2,4);

        MinhaCalculadora.somarInteiros(new int[3]);
        for(int i = 0; i < 3; i++) {
            MinhaCalculadora.somarInteiros(new int[i]);
        }




    }
}
