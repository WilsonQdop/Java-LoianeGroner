package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		boolean verificador = true;
		int qtdProdutos;
		double troco=0, preco , total = 0;
		String continuarCompra, output;
		
		do {
			System.out.println("Deseja informar uma nova compra? (Sim/Nao)");
			 continuarCompra = input.next();
			 
			 if(continuarCompra.equalsIgnoreCase("sim")) {
				 output = "Lojas Tabajara\n";
				 
				 System.out.println("Digite a quantidade de produto da compra: ");
				 qtdProdutos = input.nextInt();
				 
				 
				 for(int i = 1; i <= qtdProdutos; i++) {
					 System.out.println("Informe preco do produto " + i + ": ");
					 preco = input.nextDouble();
					 total += preco;
					 output += "produto " + i + " R$ " + preco + "\n";
					 
				 }
				 output += "Total: R$ " + total + "\n";
				 System.out.println("Total: R$ " + total);
				 
				 System.out.println("Entre com o valor de pagamento: ");
				 double pagamento = input.nextDouble();
				 output += "Pagamento: " + pagamento + "\n";
				 
				 troco = pagamento - total;
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
			 }
			 
			 else {
				 System.out.println("Saindo ...");
				 verificador = false;
			 }
			 
			
		}while(verificador);
	

	}

}
