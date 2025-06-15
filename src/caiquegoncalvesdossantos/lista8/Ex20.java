package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer[] AA=new Integer[10];
        System.out.println("Digite 10 elementos:");
        for(int i=0; i<10; i++) AA[i]=sc.nextInt();

        Arrays.sort(AA, Collections.reverseOrder());
        System.out.println("Vetor ordenado decrescente:");
        for(int v: AA) System.out.print(v + " ");
    }
}