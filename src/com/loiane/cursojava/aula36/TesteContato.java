package com.loiane.cursojava.aula36;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Wilson");
        // contato.setEndereco("Rua Maria Lima da Silva");
        // contato.setTelefone("81 988430765");

        Endereco endereco = new Endereco("Maria lima da Silva", "Rua da sorveteria CIA", "Pernambuco", "Recife", "51335-290", "49");
        Telefone telefone =  new Telefone("Claro", "81", "98843-0765");
        Telefone telefone2 =  new Telefone("Vivo", "21", "98888-9888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;


        contato.setEndereco(endereco);
        //contato.setTelefone(telefone);
        contato.setTelefone(telefones);

        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCep());
        }
        /*if(contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getOperadora() + " " + contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/
        if(contato != null && contato.getTelefone() != null) {
            for(int i = 0; i < telefones.length; i++) {
                System.out.println(telefones[i].getOperadora());
                System.out.println();
                System.out.println(telefones[i].getDdd() + " " + telefones[i].getNumero());
            }
        }
    }
}
