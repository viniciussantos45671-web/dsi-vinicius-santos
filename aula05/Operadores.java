package aula05;

public class Operadores {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = a + b; // Adição
        int diferenca = a - b; // Subtração
        int produto = a * b; // Multiplicação
        int quociente= a / b; // Divisão
        int resto = a % b; // Módulo

        System.out.println("A soma de a e b é igual a" + sum + "!");
        System.out.println("A diferença entre a e b é igual a" + diferenca + "!");
        System.out.println("O produto de a e b é igual a" + produto + "!");
        System.out.println("O quociente da divisão é " + quociente + "!");
        System.out.println("O resto da divisão é " + resto + "!");

    }
}