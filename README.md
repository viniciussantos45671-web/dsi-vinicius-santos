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
