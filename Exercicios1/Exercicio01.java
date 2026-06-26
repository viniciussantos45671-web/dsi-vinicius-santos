package Exercicios1;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int numeroFuncionario;
        int horasTrabalhadas;
        int filhosMenores14;
        int idade;
        int tempoServico;

        double valorHora;
        double salarioBruto;
        double salarioFamilia;
        double inss;
        double ir = 0;
        double adicional = 0;
        double totalDescontos;
        double salarioLiquido;

        final double VALOR_SALARIO_FAMILIA = 50.0;

        System.out.print("Número do funcionário: ");
        numeroFuncionario = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do funcionário: ");
        nome = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Valor recebido por hora: ");
        valorHora = sc.nextDouble();

        System.out.print("Quantidade de filhos menores de 14 anos: ");
        filhosMenores14 = sc.nextInt();

        System.out.print("Idade: ");
        idade = sc.nextInt();

        System.out.print("Tempo de serviço (anos): ");
        tempoServico = sc.nextInt();

        // Salário bruto
        salarioBruto = horasTrabalhadas * valorHora;

        // Salário família
        salarioFamilia = filhosMenores14 * VALOR_SALARIO_FAMILIA;

        // INSS
        inss = salarioBruto * 0.085;

        // IR
        if (salarioBruto > 1500) {
            ir = salarioBruto * 0.15;
        } else if (salarioBruto > 500) {
            ir = salarioBruto * 0.08;
        } else {
            ir = 0;
        }

        // Adicional
        if (idade > 40) {
            adicional = salarioBruto * 0.02;
        }

        if (tempoServico > 15) {
            adicional = salarioBruto * 0.035;
        } else if (tempoServico > 5 && tempoServico <= 15 && idade > 30) {
            adicional = salarioBruto * 0.015;
        }

        // O Total de descontos
        totalDescontos = inss + ir;

        // O Salário líquido
        salarioLiquido = salarioBruto - totalDescontos + salarioFamilia + adicional;

        // Resultado

        System.out.println("\n========== RESULTADO ==========");
        System.out.println("Funcionário: " + nome);
        System.out.println("Número: " + numeroFuncionario);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Salário Família: R$ %.2f%n", salarioFamilia);
        System.out.printf("INSS: R$ %.2f%n", inss);
        System.out.printf("IR: R$ %.2f%n", ir);
        System.out.printf("Total de Descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Adicional: R$ %.2f%n", adicional);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
        System.out.println("\n==========================");

    }
}
      

