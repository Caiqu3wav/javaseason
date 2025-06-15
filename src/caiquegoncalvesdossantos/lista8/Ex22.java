package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N, max;
        do {
            System.out.print("Quantidade (<=20): ");
            N=sc.nextInt();
        } while(N > 20 || N<=0);
        int[] AC=new int[N];
        System.out.print("Valor máximo para elementos: ");
        max=sc.nextInt();

        for(int i=0;i<N;i++) {
            int val;
            do {
                System.out.print("Elemento "+(i+1)+": ");
                val=sc.nextInt();
            } while(val < 0 || val > max);
            AC[i]=val;
        }

        System.out.println("Vetor AC:");
        for(int v:AC) System.out.print(v+" ");
    }
}