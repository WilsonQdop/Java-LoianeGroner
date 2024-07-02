# Orientação a objetos 
* **Atributos:** É definição de variáveis que um objeto possui. 

* **Métodos:** Ações que cada objeto pode exibir.

* **Métodos: ** Ações que cada objeto pode exibir.

    
 ## Tipos de classes

 * **Void** = cria um método/classe que não retorna nenhum valor. Basicamente só imprime.
 * **Classes com atributo** = cria um método/classe que retorna uma operação.
 * **Classes com parâmetros =** pedir variáveis extras para realizar a operação proposta na classe.



## Construtores


* A palavra chave **This** referencia atributos e métodos da própria classe;
    
    Exemplo:  Neste exemplo ela está referenciando atributos declarada na classe principal (mãe) e referencia atráves de construtores.  
  
           public Carro(String marca, String modelo, int numPassageiros) {
            this.marca = marca;
            this.modelo = modelo;
            this.numPassageiros = numPassageiros;
            System.out.println("Chamando o construtor 3 com 3 parâmetros");

        }
      
        public Carro(String marca, String modelo) {
            this(marca, modelo, 10);
            System.out.println("Chamando o construtor 2 com 2 parâmetros");
        }

## Encapsulamento

* É a maneira que você modifica a visibilidade os elementos da sua classe, tanto quanto private, public, default ou protected
* Principais palavras chaves do encapsulamento: **This, Get e Set**;
* This, como dito anteriormente, é uma maneira de referenciar um elemento (Normalmente um atributo) Exemplo = This.modelo.
* Set, é a classe modificadora de valor. Exemplo: setModelo("Aqui dentro você põe seu respectivo valor");
* Get, é a classe de visualização de valor. Exemplo: getModelo. Aqui ela vai referenciar o valor cetado no método set ou irá mostrar uma operação usando ela como base.

      public String getMarca() {
        return this.marca;
      }

      public void setMarca(String marca) {
        this.marca = marca;
      }

      setMarca("Wilson"); 
      System.out.println(getMarca); -> Tem que retornar a String "Wilson";

## Métodos recursivos
* O método chama ele mesmo várias vezes até um ponto de parada. Funciona basicamente como uma coluna de cima para baixo. Primeiro faz o método de cima, daí executa os de baixo. 
  * Exemplos: 
  
* **Não recursivo**
  
      public int fatorial(int numero) {
        int fatorial = 1;
        for(int i = numero; i >= 1; i-- {  
    
          if(numero == 0) {
            return 1;
          }
    
          fatorial *= i;
        }
          return fatorial;
      }


* **Recursivo**
  
      public int fatorial(int numero) {

        if(numero == 0) { // Condição de parada;
          return 1;
        }
        return numero * fatorial(numero - 1);
        }


## Relacionamentos entre classes
* Relacionamento entre classes é uma forma de declarar uma classe dentro da outra. Usando como exemplo um atributo endereço, podemos colocar outra outra classe para fazer um complemento para o atributo endereço da primeira classe.

      public class Contato {
        private String nome;
        private Endereco endereco;
        private Telefone[] telefones;
      }
  * A classe (Contatos) acima tem três atributos declarados. Nome (que está como declarada como String), endereço (Que está declarada com o tipo Endereço) e o telefones (Que está declarada com o tipo Telefone[]).
  Basicamente, os atributos Endereço e telefones estão sendo declaradas por uma outra classe, que também tem atributos dentro delas.

*
        public class Endereco {
          private String nomeRua;
          private String complemento;
          private String cidade;
          private String estado;
          private String cep;
          private String numero;
        }
*
        public class Telefone {
          private String operadora;
          private String ddd;
          private String numero;
        }






    
