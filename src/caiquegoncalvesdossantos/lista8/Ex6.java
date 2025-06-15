package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean r = true;

        System.out.println("Quantos elementos do primeiro?(até 15): ");
        int n = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0; i <= n * 2; i++){
            if(i < 15){
                System.out.println("Qual elemento " + i +  " do primeiro?");
                int el1 = scan.nextInt();
                A[i] = el1;
            } else{
                System.out.println("Qual elemento " + i +  " do segundo?");
                int el2 = scan.nextInt();
                B[i] = el2;
            }
        }

        for (int i = 0; i < n; i++){
            while (r) {
                if (A[i] != B[i]) r = false;
            }
        }

        System.out.println(r ? "Vetor igual" : "Vetor não igual");
    }
}
