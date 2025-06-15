package collage.lista5;

import java.util.Scanner;

public class NotasEMedia {
        public static void main() {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insira sua nota");
            double nota = scan.nextDouble();
            System.out.println("Insira sua 2° nota");
            double nota2 = scan.nextDouble();
            double media = (nota2 + nota) / 2;
            System.out.println(media > 5 ? "Aprovado" : "Reprovado");
            System.out.println("A média é: " + media);
        }
    }