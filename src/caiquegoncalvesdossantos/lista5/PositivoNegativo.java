package collage.lista5;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número");
        double num = scan.nextDouble();
        System.out.println(num >= 0 ? "Número positivo" : "Numero negativo");
    }

}
