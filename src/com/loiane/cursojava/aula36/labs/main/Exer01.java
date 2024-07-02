package com.loiane.cursojava.aula36.labs.main;


import com.loiane.cursojava.aula36.labs.objetos.Agenda;
import com.loiane.cursojava.aula36.labs.objetos.Contato;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = input.nextLine();

        Agenda agendas = new Agenda(nome);
        Contato[] contatos = new Contato[3];

        for(int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informações do " + (i+1) + " contato: ");
            System.out.println("Nome: ");
             nome = input.nextLine();
            System.out.println("Telefone: ");
            String telefone = input.nextLine();
            System.out.println("Email: ");
            String email = input.nextLine();
            Contato cont = new Contato(nome, telefone, email);

            contatos[i] = cont;

        }
        agendas.setContatos(contatos);
    }
}
