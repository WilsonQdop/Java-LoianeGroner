package com.loiane.cursojava.aula20.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		int dia = 0, hora = 0;
		boolean verificador = true;

		while (verificador) {
			System.out.println("Deseja prosseguir para a agenda pessoal? (Sim / Nao)");
			String verificar = input.next();

			if (verificar.equalsIgnoreCase("sim")) {
				System.out
						.println("Deseja entrar com um compromisso ou consultar agenda? (1 - compromisso, 2 - agenda)");
				int opcao = input.nextInt();

				switch (opcao) {
				case 1:
					boolean verificarDia = true;
					while (verificarDia) {
						System.out.println("Entre com o dia");
						dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						verificarDia = false;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
					}
					
					boolean verificarHora = true;
					while (verificarHora) {
						System.out.println("Entre com o horário");
						hora = input.nextInt();
						if (hora >= 0 && hora <= 24) {
							verificarHora = false;
						} else {
							System.out.println("Hora inválido, digite novamente!");
						}
					}
					dia--;
					System.out.println("Digite o compromisso: ");
					compromissos[dia][hora] = input.next();
					break;
				case 2:

					 verificarDia = true;
					while (verificarDia) {
						System.out.println("Entre com o dia");
						dia = input.nextInt();
					if (dia > 0 && dia <= 31) {
						verificarDia = false;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
					}
					
					 verificarHora = true;
					while (verificarHora) {
						System.out.println("Entre com o horário");
						hora = input.nextInt();
						if (hora >= 0 && hora <= 24) {
							verificarHora = false;
						} else {
							System.out.println("Hora inválido, digite novamente!");
						}
					}
					dia--;
					System.out.println("Compromisso agendado: ");
					System.out.println(compromissos[dia][hora]);
					
				}

			} else if (verificar.equalsIgnoreCase("Nao")) {
				System.out.println("saindo...");
				break;
			} else {
				System.out.println("Opção inválida, tente novamente!");
			}
		}

	}

}
