package caiquegoncalvesdossantos.lista8;

import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] AB=new int[10];
        int[] result = new int[10];
        int count=0;
        System.out.println("Digite 10 elementos:");
        for(int i=0;i<10;i++) AB[i]=sc.nextInt();

        for(int v:AB) {
            if (v % 2 != 0) result[count++] = v * 2;
        }

        System.out.println("Resultado:");
        for(int i=0;i<count;i++) System.out.print(result[i]+" ");
    }
}