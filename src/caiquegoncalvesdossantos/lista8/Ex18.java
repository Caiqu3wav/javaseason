package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex18 {
    public static long factorial(int n) {
        long f=1;
        for(int i=2;i<=n;i++) f*=i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantidade de fatoriais (<=15): ");
        int N=sc.nextInt();
        long[] Y=new long[N];
        for(int i=0;i<N;i++) Y[i]=factorial(i+1);
        System.out.println("Fatoriais:");
        for(long v:Y) System.out.print(v+" ");
        sc.close();
    }
}