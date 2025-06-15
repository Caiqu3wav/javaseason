package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Tamanho de AD: ");
        size=sc.nextInt();
        int[] AD=new int[size];
        System.out.println("Digite elementos:");
        for(int i=0;i<size;i++) AD[i]=sc.nextInt();

        int[] pares=new int[size];
        int count=0;
        for(int v:AD) if(v%2==0) pares[count++]=v;

        Arrays.sort(pares,0,count);
        System.out.println("Pares ordenados crescentemente:");
        for(int i=0;i<count;i++) System.out.print(pares[i]+" ");
        sc.close();
    }
}