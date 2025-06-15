package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o número");
        int n = scan.nextInt();
        int atual = 2;

        for (int i = 0; i < n; i++) {
            if (ehPrimo(atual)){
                System.out.print(atual + " ");
            }
            atual++;
        }
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}