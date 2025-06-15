package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 5;
        int[] PA = new int[n];
        int[] PB = new int[n];

        System.out.println("Insira os 5 números do primeiro vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            PA[i] = scan.nextInt();
        }

        System.out.println("Insira os 5 números do segundo vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            PB[i] = scan.nextInt();
        }

        int[] result = new int[2 * n];

        System.arraycopy(PA, 0, result, 0, n);
        System.arraycopy(PB, 0, result, n, n);

        System.out.println("\nPrimeiro vetor: " + Arrays.toString(PA));
        System.out.println("Segundo vetor: " + Arrays.toString(PB));
        System.out.println("Resultado (concatenado): " + Arrays.toString(result));

        scan.close();
    }
}