package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma string:");
            String input = scanner.nextLine();

            System.out.println("Escolha uma opção: ");
            System.out.println("1: cripto ");
            System.out.println("2: descripto ");
            System.out.println("3: sair ");
            int option = scanner.nextInt();

            if(option == 3) {
                loop = false;
                Runtime.getRuntime().exit(0);
            }
            else if (option == 1) {
                input = input.replaceAll("z", "p");
                input = input.replaceAll("e", "o");
                input = input.replaceAll("n", "l");
                input = input.replaceAll("i", "a");
                input = input.replaceAll("r", "t");
            } else if (option == 2) {
                input = input.replaceAll("p", "z");
                input = input.replaceAll("o", "e");
                input = input.replaceAll("l", "n");
                input = input.replaceAll("a", "i");
                input = input.replaceAll("t", "r");
            }
            System.out.println("Resultado: " + input);
        }
    }
}