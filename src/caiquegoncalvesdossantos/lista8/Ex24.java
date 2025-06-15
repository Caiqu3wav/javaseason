package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Tamanho de AE: ");
        size=sc.nextInt();
        Integer[] AE=new Integer[size];
        System.out.println("Digite elementos:");
        for(int i=0;i<size;i++) AE[i]=sc.nextInt();

        int count=0;
        Integer[] impares=new Integer[size];
        for(int v:AE) if(v%2!=0) impares[count++]=v;

        Arrays.sort(impares,0,count,Collections.reverseOrder());
        System.out.println("Ímpares ordenados decrescentemente:");
        for(int i=0;i<count;i++) System.out.print(impares[i]+" ");
        sc.close();
    }
}