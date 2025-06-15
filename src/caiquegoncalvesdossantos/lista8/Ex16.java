package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Número de Fibonacci (<=20): ");
        int N=sc.nextInt();
        int[] V=new int[N];
        if(N>0) V[0]=0;
        if(N>1) V[1]=1;
        for(int i=2;i<N;i++) V[i]=V[i-1]+V[i-2];

        System.out.println("Sequência Fibonacci:");
        for(int v:V) System.out.print(v+" ");
        sc.close();
    }
}