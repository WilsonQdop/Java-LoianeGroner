package com.loiane.cursojava.aula24.labs.main;

import com.loiane.cursojava.aula24.labs.objetos.AgendaContatos;

public class Exer06 {

	public static void main(String[] args) {
		AgendaContatos contato1 = new AgendaContatos();
		
		contato1.nome = "Wilson";
		contato1.endereco = "Rua da esquina";
		contato1.email = "Vaitomarnocu@Gmail.com";
		contato1.telefones = new int[2];
		contato1.telefones[0] = 12322;
		contato1.telefones[1] = 323232;
		contato1.telefones[2] = 454445;
	}

}
