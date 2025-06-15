package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantidade de elementos de AM (<=10): ");
        int N=sc.nextInt();
        String[] AM=new String[N];

        System.out.println("Digite as palavras/frases:");
        for(int i=0;i<N;i++) AM[i]=sc.next();

        System.out.println("Vetor original:");
        System.out.println(Arrays.toString(AM));

        Arrays.sort(AM);
        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(AM));
        sc.close();
    }
}