package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];

		int dia = 0, hora = 0, mes = 0;
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
					boolean verificarMes = true;
					while (verificarMes) {
						System.out.println("Entre com o mês");
						mes = input.nextInt();
						if (mes > 0 && mes <= 12) {
							verificarMes = false;
						} else {
							System.out.println("Mês inválido, digite novamente!");
						}
					}
					
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
						if (hora >= 0 && hora <= 8) {
							verificarHora = false;
						} else {
							System.out.println("Hora inválido, digite novamente!");
						}
					}
					mes--;
					dia--;
					System.out.println("Digite o compromisso: ");
					compromissos[mes][dia][hora] = input.next();
					break;
				case 2:
					 verificarMes = true;
					while (verificarMes) {
						System.out.println("Entre com o mês");
						mes = input.nextInt();
						if (mes > 0 && mes <= 12) {
							verificarMes = false;
						} else {
							System.out.println("Mês inválido, digite novamente!");
						}
					}

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
						if (hora >= 0 && hora <= 8) {
							verificarHora = false;
						} else {
							System.out.println("Hora inválido, digite novamente!");
						}
					}
					dia--;
					System.out.println("Compromisso agendado: ");
					System.out.println(compromissos[mes][dia][hora]);
					
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
