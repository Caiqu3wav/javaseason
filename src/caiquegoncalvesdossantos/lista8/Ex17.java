package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex17 {
    public static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++) if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Número de primos (<=20): ");
        int N=sc.nextInt(), count=0;
        int[] X=new int[N], num= {2};
        int numAtual=2;
        while(count<N) {
            if(isPrime(numAtual)) {
                X[count++]=numAtual;
            }
            numAtual++;
        }
        System.out.println("Primos:");
        for(int v:X) System.out.print(v+" ");
        sc.close();
    }
}