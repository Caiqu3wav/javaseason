package collage.lista4;

import java.util.Scanner;
import java.util.Random;


public class Saudacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hora;

        System.out.println("Digite 1 para inserir a hora manualmente ou 2 para gerar aleatoriamente:");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
        System.out.print("Informe a hora (0 a 23): ");
        hora = scanner.nextInt();
    } else {
        hora = new Random().nextInt(24);
        System.out.println("Hora gerada aleatoriamente: " + hora);
    }

        if (hora < 0 || hora > 23) {
        System.out.println("Hora inválida!");
        return;
    }

        if (hora <= 6) {
        System.out.println("Zzzzz");
        } else if (hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora <= 17) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        scanner.close();
}
}
