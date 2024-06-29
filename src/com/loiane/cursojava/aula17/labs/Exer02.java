package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		boolean loginValido = false;
		String usuario, senha;
		
		while(!loginValido) {
			
			System.out.println("Digite seu usuário: ");
			 usuario = input.next();
			
			System.out.println("Digite sua senha: ");
			 senha = input.next();
			
			if(usuario.equalsIgnoreCase(senha)) {
				
				System.out.println("Erro, tente novamente.");
				
				
				
			}
			else {
				loginValido = true;
				System.out.println("Login efetuado com sucesso.");
			}
		}
		
	}
}
