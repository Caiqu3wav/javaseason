package collage.lista5;

import java.util.Scanner;

public class ValorCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        int valor1 = scanner.nextInt();
        System.out.println("Qual o segundo valor?");
        int valor2 = scanner.nextInt();

        System.out.println(valor1 < valor2 ? valor1 + " "+ valor2 : valor2 + " "+ valor1);
    }
}
