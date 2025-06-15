package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque quantidade de n pra sequência: ");
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.print(i);
                if (i < n) System.out.print("  +  ");
                sum += i;
            }
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i % 2 != 0 ? i + " " : "  ");
            if(i % 2 != 0){
                sum += i;
                if (i > 1) {
                    System.out.print("  ");
                }
            }
        }
        System.out.println("\nSoma: "+ sum);
    }
}