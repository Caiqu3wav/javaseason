package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex41 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o número e veja a soma calculo dos fatoriais x");
        int n = scan.nextInt();
        while (n < 0) {
            System.out.println("Coloque o número novo");
            n = scan.nextInt();
    }

        if (n == 0) {
            Runtime.getRuntime().exit(0);
        }

        int multFatoriais = n;

        System.out.println("De 1 até n/2:");
        for (int i = n - 1; i > 1; i--) {
            System.out.print(i + " x " + multFatoriais);
            multFatoriais *= i;
            if (i != 1) {
                System.out.print(", ");
            }
        }
        System.out.println(multFatoriais);
    }
}