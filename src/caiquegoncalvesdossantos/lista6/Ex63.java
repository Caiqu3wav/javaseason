package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque quantidade de n pra sequência: ");
        int n = scan.nextInt();
        int sum = 0;

        int[] fiboNs = {0, 1};

        for (int i = 1; i < n - 1; i++) {
            System.out.print(fiboNs[1] + " + ");
            int newN = fiboNs[0] + fiboNs[1];
            fiboNs[0] = fiboNs[1];
            fiboNs[1] = newN;
            sum += newN;
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