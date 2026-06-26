package Exercicios1;

import java.util.Scanner; // Abre o Scanner para liberar recursos do sistema Java

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, aux;

        System.out.print("Digite o primeiro lado: ");
        a = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        b = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        c = sc.nextDouble();

        // Ordenando em ordem decrescente (a >= b >= c)
        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a < c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println("\nLados em ordem decrescente:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        // Verifica se forma triângulo
        if (a >= b + c) {
            System.out.println("Não formam um triângulo.");
        } else {

            // Classificação pelos ângulos
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("Triângulo Retângulo.");
            } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("Triângulo Obtusângulo.");
            } else {
                System.out.println("Triângulo Acutângulo.");
            }

            // Classificação pelos lados
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        }

        sc.close(); // Fecha o Scanner para liberar recursos do sistema Java
}

    