package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
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
                StringBuilder resultado = new StringBuilder();
                for (char c : input.toCharArray()) {
                    if (c >= 'A' && c <= 'Z') {
                        resultado.append((char) ((c - 'A' + 13) % 26 + 'A'));
                    } else if (c >= 'a' && c <= 'z') {
                        resultado.append((char) ((c - 'a' + 13) % 26 + 'a'));
                    } else {
                        resultado.append(c);
                    }
                }
                System.out.println(resultado.toString());
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close(); // Fechar o scanner ao final
    }
}