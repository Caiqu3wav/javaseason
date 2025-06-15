package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Frase: ");
        String frase=sc.nextLine();
        String[] palavras=frase.trim().split("\\s+");
        int N=palavras.length;

        System.out.println("Quantidade de palavras: "+N);
        System.out.println("Vetor AN original:");
        System.out.println(Arrays.toString(palavras));

        Arrays.sort(palavras);
        System.out.println("Vetor AN ordenado:");
        System.out.println(Arrays.toString(palavras));
    }
}