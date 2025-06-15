package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o termo perfeitos: ");
        int termo = scan.nextInt();
        int n = 1;
        int counter = 0;

        while(counter < termo){
            int sum = 0;
            for(int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n){
                System.out.println(n);
                counter++;
            }
            n++;
        }
    }
}