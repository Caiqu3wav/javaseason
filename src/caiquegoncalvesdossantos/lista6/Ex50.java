package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o número de início: ");
        int atual = scan.nextInt();
        System.out.print("Coloque a quantidade de termos da sequência de primos: ");
        int n = scan.nextInt();

        System.out.println("Sequência de primos a partir de " + atual + ":");

        int count = 0;

        for (int i = atual; count < n; i++) {
            if (ehPrimo(i)){
                System.out.print(i + " ");
                count++;
            }
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