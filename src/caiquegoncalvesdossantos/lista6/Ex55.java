package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o número para ver se é perfeito: ");
        int n = scan.nextInt();
        int sum = 0;
        int counter = 1;


        while(sum != n && counter <= n / 2){
            if (n % counter == 0) sum += counter;
            counter++;
        }

        if (sum == n){
            System.out.println(n+ " é um número perfeito.");
        } else{
            System.out.println(n+ " não é um número perfeito.");
        };

        scan.close();
    }
}