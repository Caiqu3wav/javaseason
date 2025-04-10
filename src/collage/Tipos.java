package collage;
import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c = 0;
        double delta = 0;
        double x1, x2 = 0;

        System.out.println("Entre com o valor de A: ");
        a = scanner.nextInt();

        if (a == 0) {
            throw new IllegalArgumentException("A igual a zero, input inválido");
        }
        System.out.println("");

    }



}
