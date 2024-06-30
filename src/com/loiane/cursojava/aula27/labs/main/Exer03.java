package com.loiane.cursojava.aula27.labs.main;

import java.util.Scanner;

import java.util.Scanner;

import com.loiane.cursojava.aula27.labs.objetos.Aluno;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.nome = input.next();
		
		System.out.println("Entre com o nome do curso:  ");
		aluno.curso = input.next();
		
		System.out.println("Entre com o  número da matricula:  ");
		aluno.matricula = input.next();
		
		for(int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + i + ": ");
			aluno.nomeDisciplinas[i] = input.next();
		}
		
		for(int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo a nota da disciplina " + aluno.nomeDisciplinas[i] + ": ");
			for(int j = 0; j < aluno.notasDisciplinas[i].length; j++)  {
				System.out.println("Obtendo as notas: " + (j+1));
				aluno.notasDisciplinas[i][j] = input.nextDouble();	
			}
		}
			aluno.mostrarInfo();
		
		 for(int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if(aluno.resultadoEscolar(i)) {
				System.out.println("O aluno com media de + " + aluno.obterMedia(i) +" na disciplina " + aluno.nomeDisciplinas[i] + " foi aprovado!");
			} else {
				System.out.println("O aluno com media de + " + aluno.obterMedia(i) +" na disciplina " + aluno.nomeDisciplinas[i] + " foi reprovado!");
			}
		}
		
	}

}
