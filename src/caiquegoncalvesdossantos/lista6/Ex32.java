package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex32 {

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

        for (int i = 0; i < 10; i += 2) {

            System.out.println(i);
        }
    }

}