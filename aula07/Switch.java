package aula07;

public class Switch {
    public static void main(String[] args) {
    String nome = "Ariana Grande";

switch (nome) {

    case "Britney Spears":
    System.out.println("1");
    break;

    case "Lady Gaga":
    System.out.println("2");
    break;

    case "Charli xcx":
    System.out.println("3");
    break;

    case "Sabrina Carpenter":
    System.out.println("4");
    break;

    case "Ariana Grande":
    System.out.println("5");
    break;

    case "Shania Twain":
    System.out.println("6");
    break;

    case "Kylie Minogue":
    System.out.println("7");
    break;

    default:
    System.out.println("Cantora não encontrada");
}

    }
}