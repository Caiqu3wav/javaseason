package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos elementos?:");
        int n = scan.nextInt();
        int[] C = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Adicione o elemento " + i);
            C[i] = scan.nextInt();
        }

        for (int nm : C){
            System.out.print(nm + " ");
        }
    }
}
