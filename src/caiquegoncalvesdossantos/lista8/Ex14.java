package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] S=new int[10], T=new int[15], U=new int[25];

        System.out.println("Digite 10 elementos de S:");
        for(int i=0;i<10;i++) S[i]=sc.nextInt();

        System.out.println("Digite 15 elementos de T:");
        for(int i=0;i<15;i++) T[i]=sc.nextInt();

        for(int i=0;i<10;i++) U[i*2]=S[i];
        for(int i=0;i<15;i++) U[i*2+1]=T[i];

        System.out.println("Vetor U:");
        for(int v:U) System.out.print(v+" ");
        sc.close();
    }
}