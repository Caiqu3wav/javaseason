package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Tamanho de AF: ");
        size=sc.nextInt();
        Integer[] AF=new Integer[size];
        System.out.println("Digite elementos:");
        for(int i=0;i<size;i++) AF[i]=sc.nextInt();

        Integer[] impares=new Integer[size], pares=new Integer[size];
        int impCount=0, parCount=0;

        for(int v:AF) {
            if(v%2==0) pares[parCount++]=v;
            else impares[impCount++]=v;
        }

        Arrays.sort(impares,0,impCount);
        Arrays.sort(pares,0,parCount,Collections.reverseOrder());

        int index=0;
        for(int i=0;i<impCount;i++) AF[index++]=impares[i];
        for(int i=0;i<parCount;i++) AF[index++]=pares[i];

        System.out.println("Vetor ordenado:");
        for(int v:AF) System.out.print(v+" ");
    }
}