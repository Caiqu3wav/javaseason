package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M;
        System.out.print("N (<=10): ");
        N=sc.nextInt();
        int[] P=new int[N];
        System.out.println("Digite os elementos de P:");
        for(int i=0;i<N;i++) P[i]=sc.nextInt();

        System.out.print("M (<=15): ");
        M=sc.nextInt();
        int[] Q=new int[M];
        System.out.println("Digite os elementos de Q:");
        for(int i=0;i<M;i++) Q[i]=sc.nextInt();

        int[] R=new int[N+M];
        System.arraycopy(P,0,R,0,N);
        System.arraycopy(Q,0,R,N,M);

        System.out.println("Vetor R:");
        for(int v:R) System.out.print(v+" ");
        sc.close();
    }
}