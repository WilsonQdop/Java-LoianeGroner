# Orientação a objetos 
* **Atributos:** É definição de variáveis que um objeto possui. 
* **Métodos:** Ações que cada objeto pode exibir.
    
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





    
