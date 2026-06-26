package aula07;

public class Break {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break; // para o loop quando i for 5
            }

            System.out.println(i);
        }
    }
}