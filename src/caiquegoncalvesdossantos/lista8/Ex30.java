package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantidade de elementos do vetor AK (<=20): ");
        int N=sc.nextInt();
        Double[] AK=new Double[N];

        System.out.println("Digite os elementos:");
        for(int i=0;i<N;i++) AK[i]=sc.nextDouble();

        Arrays.sort(AK);
        Double[] AL=new Double[N*2-1];

        int j=0;
        for(int i=0;i<N-1;i++) {
            AL[j++]=AK[i];
            AL[j++]=(AK[i]+AK[i+1])/2;
        }
        AL[j]=AK[N-1];

        System.out.println("Vetor AK ordenado:");
        for(double v:AK) System.out.print(v+" ");
        System.out.println("\nVetor AL com médias:");
        for(double v:AL) System.out.print(v+" ");
        sc.close();
    }
}