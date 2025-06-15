package caiquegoncalvesdossantos.lista8;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] B = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        System.out.println("\nElementos do vetor A:");
        for (int i = 15; i >= 0; i--) {
            System.out.println("A[" + i + "] = " + B[i]);
        }

        scanner.close();
    }

}
