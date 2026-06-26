# dsi-vinicius-santos
Aula de Desenvolvimento de Software utilizando JAVA

# Regras Básicas - Java

#### Como configurar o java no computador?

1. Instalar o JDK (Java Developer Kit):

*o JDK é essencial para que o nosso código
desenvolva, compile e rodar aplicações em java.*

2. Configuração das variáveis de ambiente:

*Variáveis de ambiente são configurações do sistema que dizem ao Sistema Operacional onde encontrar certos programas. Sem configurar as varáveis de ambiente o 'java' não é reconhecido.*

3. Teste:

*Agora devemos testar o código para ver se está **compilando**.*

#### Como funciona o código do java?

O código do java funciona em etapas:

* Escrever -> Compilar -> Executar


#### O que é uma Classe?

*Uma classe em java é uma estrutura fundamental que define um tipo de objeto. É utilizada como um modelo ou plano para criar objetos que compartilham características comuns.*

#### Exemplos de Classes:

 ```java

public class Pessoa {

  // Campos

  private String nome;

  private int idade;

  // Construtor

  public Pessoa(String nome, int idade) {

    this.nome = nome;

    this.idade = idade;

  }

  // Métodos

  public void saudacao() {

    System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");

  }

  public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("João", 30);

    pessoa1.saudacao();

  }

}

```

**PORTELA, Edson. Entendendo Classes em Java. Disponível em:** *https://www.dio.me/articles/entendendo-classes-em-java* **Acesso em: 14 mar. 2026**


### Anotações

# O que o código faz:
* Cria um array com nomes de cantoras
* Usa um contador `i`
* Percorre a lista até o final



## Break

Exemplo de uso do `break`.

###  O que o código faz:
* Usa um loop `for`
* Interrompe a execução quando a condição é atendida
* Demonstra como sair de um loop antes do fim



## Conceitos aprendidos

* Estruturas de repetição (`while`, `for`)
* Controle de fluxo (`break`)
* Arrays em Java
* Boas práticas (como uso de `sc.close()` em Scanner)


##  Observações

* Sempre inicializar corretamente variáveis de controle em loops
* Usar `break` com cuidado para não interromper lógica sem necessidade
* Fechar o `Scanner` quando não for mais usado
