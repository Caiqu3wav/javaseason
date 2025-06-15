package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque a quantidade de termos da sequência Fibonacci: ");
        int n = scan.nextInt();

        int[] fiboNs = {0, 1};

        for (int i = 0; i < n - 1; i++) {
            System.out.print(fiboNs[0] + ", ");
            int newN = fiboNs[0] + fiboNs[1];
            fiboNs[0] = fiboNs[1];
            fiboNs[1] = newN;
        }
        System.out.print(fiboNs[0]);

        scan.close();
    }
}