package caiquegoncalvesdossantos.lista8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        System.out.print("Tamanho do vetor AJ (>=10): ");
        int N=sc.nextInt();

        if(N<10) {
            System.out.println("Tamanho deve ser >=10");
            sc.close();
            return;
        }

        int[] AJ=new int[N];
        boolean[] usado=new boolean[1000]; // assume valores até 9999
        int count=0;
        while(count<N) {
            int num=rand.nextInt(10000);
            if(!usado[num]) {
                usado[num]=true;
                AJ[count++]=num;
            }
        }

        Arrays.sort(AJ);
        System.out.println("Vetor AJ ordenado:");
        for (int v : AJ) System.out.print(v + " ");

        int tentativas=10;
        System.out.println("\nAdivinhe um número do vetor:");
        for(int i=0;i<tentativas;i++) {
            System.out.print("Tentativa "+(i+1)+": ");
            int palpite=sc.nextInt();
            boolean achou=false;
            for (int j=0;j<N;j++) {
                if(AJ[j]==palpite) {
                    System.out.println("Acertou na posição: "+j);
                    achou=true;
                    break;
                }
            }
            if(achou) break;
        }
        sc.close();
    }
}