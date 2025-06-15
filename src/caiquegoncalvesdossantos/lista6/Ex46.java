package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque o número e veja se é primo");
        int n = scan.nextInt();
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        //Verificando se número pode ser impresso 6k±1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}