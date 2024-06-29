package com.loiane.cursojava.aula27.labs.main;

import com.loiane.cursojava.aula27.labs.objetos.Lampada;

public class Exer01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.desligarLampada();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		

	}

}
