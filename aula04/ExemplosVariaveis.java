package aula04;

public class ExemplosVariaveis {

    public static void main(String[] args) {
        // Criando Variaveis de diferentes data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Número de Itens: " + items);
        System.out.println("Valor por Item: " + costPerItem + currency);
        System.out.println("Valor Total = " + totalCost + currency);
    }
}