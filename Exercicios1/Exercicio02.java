package Exercicios1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String []args) {
      
        Scanner sc = new Scanner(System.in);

        int codigo;
        char sexo;
        int tempoTrabalho;
        double salario;
        double bonus;

        System.out.print("Código do funcionário: ");
        codigo = sc.nextInt();

        System.out.print("Sexo (M/F): ");
        sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Tempo de trabalho (anos): ");
        tempoTrabalho = sc.nextInt();

        System.out.print("Salário: R$ ");
        salario = sc.nextDouble();

        // Cálculo do bônus
        if (sexo == 'M' && tempoTrabalho > 15) {
            bonus = salario * 0.20;
        } else if (sexo == 'F' && tempoTrabalho > 10) {
            bonus = salario * 0.25;
        } else {
            bonus = 100.00;
        }

        System.out.println("\n========= RESULTADO =========");
        System.out.println("Código do funcionário: " + codigo);
        System.out.println("Sexo: " + sexo);
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus de Natal: R$ %.2f%n", bonus);

        sc.close();
    }
}
    
