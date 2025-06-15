package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex37 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o número");
        int n = scan.nextInt();
        while (n < 0) {
            System.out.println("Coloque o número novo");
            n = scan.nextInt();
        }

        if (n == 0) {
            Runtime.getRuntime().exit(0);
        }

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(1+ ", ");
            }
            else {
                System.out.print(i + "/" + (i + 1) + ", ");
                System.out.print(" ");
            }
        }
    }
}