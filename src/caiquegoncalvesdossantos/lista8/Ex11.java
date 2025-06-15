package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 5;
        int[] QA = new int[n];
        int[] QB = new int[n];

        System.out.println("Insira os 5 números do primeiro vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            QA[i] = scan.nextInt();
        }

        System.out.println("Insira os 5 números do segundo vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            QB[i] = scan.nextInt();
        }

        int[] QC = new int[2 * n];


        for (int i = 0, j = 0; i < n * 2; i += 2, j++) {
            QC[i] = QA[j];
            QC[i + 1] = QB[j];
        }

        System.out.println("\nPrimeiro vetor: " + Arrays.toString(QA));
        System.out.println("Segundo vetor: " + Arrays.toString(QB));
        System.out.println("Resultado (concatenado): " + Arrays.toString(QC));

        scan.close();
    }
}