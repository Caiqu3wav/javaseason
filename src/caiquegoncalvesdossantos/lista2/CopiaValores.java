package collage.lista2;

import java.util.Scanner;

public class CopiaValores {
    public static void main(String[] args) {
        float n1 = 8.60F;
        float numeroCopia = n1;
        System.out.println("numero: " + n1 + " copia " + numeroCopia);
    }

    public static class Exibeldade {

        public static void main(String[] args) {
            int idade = 20;
            System.out.println(idade);
        }

    }

    public static class ExibeNome {

        public static void main(String[] args) {
            String nome = "Caique";
            System.out.println(nome);
        }
    }

    public static class ExibeRandom {

        public static void main(String[] args) {
            double randomNumber = Math.random() * 100;
            System.out.println(((int) randomNumber));
        }
    }

    public static class Tipos {
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
}
