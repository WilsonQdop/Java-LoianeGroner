package com.loiane.cursojava.aula19.aula33.labs.main;

import com.loiane.cursojava.aula19.aula33.labs.objetos.Aluno;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno("Wilson", "Ads", 123456);

        for(int i = 0; i < aluno.getNomesCadeiras().length; i++) {
            System.out.println("Digite o nome das cadeiras: ");
            aluno.getNomesCadeiras()[i] = input.next();
        }
        for(int i = 0; i < aluno.getNotas().length; i++) {
            System.out.println("Digite as notas da cadeira " + aluno.getNomesCadeiras()[i] + ": ");
            for(int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.println("Digite a nota: " + (j+1) + ": ");
                aluno.getNotas()[i][j] = input.nextDouble();

            }
        }
        for(int i = 0; i < aluno.getNotas().length; i++) {
            if(aluno.resultadoEscolar(i)) {
                System.out.println("Aluno com média " + aluno.media(i) + " Foi aprovado na disciplina: " + aluno.getNomesCadeiras()[i]);
            } else {
                System.out.println("Aluno com média " + aluno.media(i) + " Foi reprovado na disciplina: " + aluno.getNomesCadeiras()[i]);
            }
        }
        aluno.mostrarInfo();
    }
}
