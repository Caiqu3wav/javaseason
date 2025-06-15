package collage.lista5;
import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas maçãs você quer");
        int macasQtn = scan.nextInt();
        double precoMaca = 1.30;

        if (macasQtn > 12) {
            precoMaca = 1.00;
        }
        System.out.println("O preço das maçãs ficou:" + (precoMaca * macasQtn));
    }
}
