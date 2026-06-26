package aula07;

public class WhileLoop {
    public static void main(String[] args) {

        String[] cantoras = {
            "Melanie Martinez",
            "Phoebe Bridgers",
            "Mitski",
            "Lorde",
            "Billie Eilish",
            "Slayyter",
            "Bjork"
        };

        int i = 0;

        while (i < cantoras.length) {
            System.out.println(cantoras[i]);
            i++;
        }
    }
}