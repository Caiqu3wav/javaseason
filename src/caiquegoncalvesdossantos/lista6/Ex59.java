package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o primeiro da sequência Ricci: ");
        int a = scan.nextInt();
        System.out.print("Coloque o segundo da sequência Ricci: ");
        int b = scan.nextInt();
        System.out.print("Coloque o termo dos Ricci: ");
        int termo = scan.nextInt();

        int[] fiboNs = {a, b};

        for (int i = 0; i < termo - 1; i++) {
            System.out.print(fiboNs[0] + ", ");
            int newN = fiboNs[0] + fiboNs[1];
            fiboNs[0] = fiboNs[1];
            fiboNs[1] = newN;
        }
        System.out.print(fiboNs[0]);

        scan.close();
    }
}