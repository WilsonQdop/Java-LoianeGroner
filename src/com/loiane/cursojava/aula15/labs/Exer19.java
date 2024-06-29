package com.loiane.cursojava.aula15.labs;
import java.util.Scanner;

public class Exer19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número que seja entre 0 a 999");
		int numero = input.nextInt();	
		
		int unidades = (numero%10);
		int dezenas =((numero/10)%10);
		int centenas = ((numero/100)%10);
		//int milhar = ((numero/1000));
			

		
		
		 if(centenas == 0 && dezenas == 0) {		
			 if(unidades ==0) {
				input.close();
				return;
			}
			 System.out.println(numero + " = "  + unidades +  " unidades");
			 
		}
		 else if(centenas == 0) {
				System.out.println(numero + " = " + dezenas + " dezenas e " + unidades +  " unidades");
			}
			
			else {
					System.out.println(numero + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades +  " unidades");
					
			}	
	}
}
