package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos elementos (imprimir maior e menor)?(até 20): ");
        int n = scan.nextInt();
        if (n > 20) throw new IllegalArgumentException();
        int[] E = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Adicione o elemento" + i);
            E[i] = scan.nextInt();
        }

        System.out.println("Maior elemento: " + Arrays.stream(E).max().getAsInt());
        System.out.println("Menor elemento: " + Arrays.stream(E).min().getAsInt());
    }
}