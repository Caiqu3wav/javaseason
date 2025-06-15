import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M;
        System.out.print("N (<=10): ");
        N=sc.nextInt();
        int[] S=new int[N];
        System.out.println("Digite elementos de S:");
        for(int i=0;i<N;i++) S[i]=sc.nextInt();

        System.out.print("M (<=15): ");
        M=sc.nextInt();
        int[] T=new int[M];
        System.out.println("Digite elementos de T:");
        for(int i=0;i<M;i++) T[i]=sc.nextInt();

        int[] U=new int[N+M];

        for(int i=0;i<N;i++) U[i*2]=S[i];
        for(int i=0;i<M;i++) U[i*2+1]=T[i];

        System.out.println("Vetor U:");
        for(int v:U) System.out.print(v+" ");
        sc.close();
    }
}