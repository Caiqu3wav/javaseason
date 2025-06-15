package caiquegoncalvesdossantos.lista8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex26 {
    public static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i=2; i*i<=n; i++) if (n%i==0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Tamanho de AG: ");
        int N=sc.nextInt();
        int[] AG=new int[N];

        System.out.println("Digite os elementos:");
        for (int i=0; i<N; i++) AG[i]=sc.nextInt();

        List<Integer> primos=new ArrayList<>();
        for (int v:AG) if (isPrime(v)) primos.add(v);

        Collections.sort(primos);
        System.out.println("Primos ordenados crescentemente:");
        for (int v:primos) System.out.print(v+" ");
    }
}