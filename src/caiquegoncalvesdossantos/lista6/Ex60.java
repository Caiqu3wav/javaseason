package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o primeiro da sequência Ricci: ");
        int a = scan.nextInt();
        System.out.print("Coloque o segundo da sequência Ricci: ");
        int b = scan.nextInt();
        System.out.print("Coloque o n pra verificar na sequência Ricci de " + a + " " + b + ":");
        int n = scan.nextInt();
        boolean result = false;

        int[] fiboNs = {a, b};
        while(!result && fiboNs[1] <= n) {
            for (int i = 0; i < n - 1; i++) {
                System.out.print(fiboNs[0] + ", ");
                int newN = fiboNs[0] + fiboNs[1];
                if (newN == n) result = true;
                fiboNs[0] = fiboNs[1];
                fiboNs[1] = newN;
            }
            System.out.print(fiboNs[0]);
        }

        if (result) {
            System.out.println("\nPositivo");
        } else{
            System.out.println("\nNegativo");
        }
        scan.close();
    }
}