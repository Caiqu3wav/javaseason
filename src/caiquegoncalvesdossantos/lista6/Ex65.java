package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque quantidade de n pra sequência: ");
        int n = scan.nextInt();
        int sum = 0;

        long fatorial = 1;
        boolean operador = true;

        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                fatorial *= i;
            }
            long value = operador ? fatorial : -fatorial;
            System.out.print((i > 1 ? " + " : "") + value);
            sum += value;
            operador = !operador;
        }

        System.out.println();


        for (int i = 2; i < (n * 2) + 2; i++) {
            if (i == 2) {
                System.out.print(i + "   ");
            }
            if (i > 1 && i % 2 != 0 && i % 3 != 0){
                System.out.print(i + "   ");
                sum += i;
            }
        }
        System.out.println("\nSoma: "+ sum);
    }
}