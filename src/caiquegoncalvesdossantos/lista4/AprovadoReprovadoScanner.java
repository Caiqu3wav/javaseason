package collage.lista4;

import java.util.Scanner;

public class AprovadoReprovadoScanner {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua nota");
        double nota = scan.nextInt();

        if (nota >= 0 && nota <= 10) {
            System.out.println(nota > 5 ? "Aprovado" : "Reprovado");
        }
        throw new IllegalArgumentException("Nota inválida");
    }
}
