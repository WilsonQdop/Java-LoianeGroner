package com.loiane.cursojava.aula27.labs.objetos;

public class Lampada {
	
	public String modelo;
	public String  tensao;
	public String cor;
	public String tipoLuz;
	public int potenciaWalts;	
	public int garantiaMeses;
	public boolean ligado;
	public String[] tipos = {"Abajur", "Luminaria", "Pendentes"};
	
	public void ligarLampada() {
		ligado = true;
	}
	public void desligarLampada() {
		ligado = false;
	}
	
	public void mostrarEstado() {
		if(ligado) {
			System.out.println("Lâmpada está ligada.");
		}
		else {
			System.out.println("Lâmpada está desligada.");
		}
	}
	public void mudarEstado() {
		if(ligado) {
			desligarLampada();
		}
		else {
			ligarLampada();
		}
	}
}
