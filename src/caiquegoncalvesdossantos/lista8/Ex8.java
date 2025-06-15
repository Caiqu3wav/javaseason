package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os 5 números (para somar apenas impares): ");
        int n = 5;
        int[] F = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Adicione o elemento" + i);
            F[i] = scan.nextInt();
        }

        int sum = 0;

        for (int nn : F){
            if (nn % 2 != 0){
                sum += nn;
            }
        }

        System.out.println(sum > 0 ? "A soma dos números ímpares é: " + sum
                : "Nenhum número ímpar");
    }
}