package collage.lista5;

import java.util.Scanner;

public class HoraXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a hora de início do jogo de xadres?");

        int inicioHora = scanner.nextInt();

        System.out.println("Qual a hora de final do jogo de xadres?");

        int finalHora = scanner.nextInt();

        System.out.println("Durou: " + (finalHora - inicioHora) + "horas");

    }
}
