package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Quantos elementos do primeiro?(até 15): ");
        int n = scan.nextInt();
        sum += n;
        int[] A = new int[n];
        System.out.println("Quantos elementosdo segundo?(até 15):");
        n = scan.nextInt();
        sum += n;
        int[] B = new int[n];

        int[] vetorResult = new int[sum];
        System.out.println("Vetor resultado tamanho: " + sum);
    }
}
