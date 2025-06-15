import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Tamanho de AH (>=25): ");
        int N=sc.nextInt();
        int[] AH=new int[N];

        System.out.println("Digite os elementos de AH:");
        for(int i=0;i<N;i++) AH[i]=sc.nextInt();

        System.out.print("Tamanho de AI (2<=N<=5): ");
        int M=sc.nextInt();
        if(M<2 || M>5) {
            System.out.println("Tamanho inválido para AI.");
            sc.close();
            return;
        }

        int[] AI=new int[M];
        System.out.println("Digite os elementos de AI:");
        for(int i=0;i<M;i++) AI[i]=sc.nextInt();

        boolean contem=true;
        int pos=-1;
        for(int i=0;i<=N-M;i++) {
            boolean igual=true;
            for(int j=0;j<M;j++) {
                if(AH[i+j]!=AI[j]) {
                    igual=false;
                    break;
                }
            }
            if(igual) {
                contem=true;
                pos=i;
                break;
            }
        }

        if(contem) {
            System.out.println("AI está contido em AH a partir da posição: " + pos);
        } else {
            System.out.println("AI não está contido em AH.");
        }
        sc.close();
    }
}