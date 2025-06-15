package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] P=new int[10], Q=new int[15], R=new int[25];
        System.out.println("Digite 10 elementos de P:");
        for(int i=0;i<10;i++) P[i]=sc.nextInt();
        System.out.println("Digite 15 elementos de Q:");
        for(int i=0;i<15;i++) Q[i]=sc.nextInt();

        System.arraycopy(P,0,R,0,10);
        System.arraycopy(Q,0,R,10,15);

        System.out.println("Vetor concatenado R:");
        for(int v:R) System.out.print(v+" ");
        sc.close();
    }
}