package com.loiane.cursojava.aula24.labs.main;

import java.util.Date;

import com.loiane.cursojava.aula24.labs.objetos.LivroBiblioteca;

public class Exer04 {

	public static void main(String[] args) {
		LivroBiblioteca biblioteca = new LivroBiblioteca();
		
		biblioteca.dataEntrega = new Date();
		biblioteca.alugado = true;
		biblioteca.nomeAlugado = "Wilson";
		System.out.println(biblioteca.dataEntrega);
	}

}
