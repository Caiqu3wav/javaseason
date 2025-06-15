package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] Z=new int[10];
        System.out.println("Digite 10 elementos:");
        for(int i=0;i<10;i++) Z[i]=sc.nextInt();

        Arrays.sort(Z);
        System.out.println("Vetor ordenado crescente:");
        for(int v:Z) System.out.print(v+" ");
        sc.close();
    }
}