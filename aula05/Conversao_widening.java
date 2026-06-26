package aula05;

public class Conversao_widening {

    public static void main(String[] args) {

        int myInt = 9;
        double myDouble = myInt; // Conversão automática (Widening)

        System.out.println(myInt);    // Saída: 9
        System.out.println(myDouble); // Saída: 9.0
    }
}