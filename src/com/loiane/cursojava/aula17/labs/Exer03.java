package com.loiane.cursojava.aula17.labs;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean cadastroValido = false;
		String nome="", estadoCivil = "", sexo = "";
		int idade = 0;
		double salario = 0;
		
		
		while(!cadastroValido) {
			
			System.out.println("Informe seu nome: ");
			nome = input.next();
			
			if(nome.length() > 3) {
				cadastroValido= true;
			}
			else {
				System.out.println("Nome inválido. Precisa de mais de três caracter");
			}
			
			cadastroValido = false;
			while(!cadastroValido) {
				
				System.out.println("Informe sua idade: ");
				idade = input.nextInt();
				
			
			 if(idade > 0 && idade <=150) {
				cadastroValido = true;
				
			}
			 else {
				 System.out.println("Idade precisa estar entre 0 e 150");
			 }
			 
			}
			
			cadastroValido = false;
			while(!cadastroValido) {
				
				System.out.println("Informe seu salário: ");
				salario = input.nextDouble(); 
				
			 if (salario > 0) {
				cadastroValido = true;
				
			}
			 
			 else {
				 System.out.println("Salário precisa ser maior que 0");
			 }
			 
			}
			
			cadastroValido = false;
			while(!cadastroValido) {
				
				System.out.println("Informe seu sexo: ");
				sexo = input.next();
				
			 if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				cadastroValido = true;
				
			}
			 
			 else {
				 System.out.println("O sexo precisa ser entre 'f' ou 'm' ");
			 }
			 
			}
			
			cadastroValido = false;
			while(!cadastroValido) {
				
				System.out.println("Informe seu estado civil: ");
				estadoCivil = input.next();
				
			 if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ) {
				cadastroValido = true;
				System.out.println(estadoCivil);
			}
 			else {
 				 System.out.println("O estado civi precisa ser entre 's', 'c', 'v' ou 'd', ");
			}
		}
		
		}
		System.out.println("Cadastro do cliente");
		System.out.println("-----------------------------------------");
		System.out.printf("\nNome: %s ",nome);
		System.out.printf("\nIdade: %d ",idade);
		System.out.printf("\nsalario: %.2f ",salario);
		System.out.printf("\nSexo: %s ",sexo);
		System.out.printf("\nEstado Civil: %s",estadoCivil);
	}

}
