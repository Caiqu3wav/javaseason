package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex40 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o número de termos");
        int n = scan.nextInt();
        while (n < 0) {
            System.out.println("Coloque o número novo");
            n = scan.nextInt();
        }

        if (n == 0) {
            Runtime.getRuntime().exit(0);
        }

        System.out.println("De 1 até n/2:");
        for (int i = 1; i <= n / 2; i++) {
            System.out.print(i);
            if (i < n / 2) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("De n até n/2+1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}