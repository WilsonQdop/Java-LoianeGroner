package com.loiane.cursojava.aula24.labs.main;

import com.loiane.cursojava.aula24.labs.objetos.Lampada;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potenciaWalts = 7;
		lampada.cor = "Amarelo";
		lampada.tipoLuz = "Amarelo";
		lampada.tipos[0] = "abajur";
		
		System.out.println(lampada.tipos[1]);

	}

}
