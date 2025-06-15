package caiquegoncalvesdossantos.lista6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o número pra verificar se tem na sequência Fibonacci: ");
        int n = scan.nextInt();

        int teste1 = 5 * (int)Math.pow(n, 2) + 4;
        int teste2 = 5 * (int)Math.pow(n, 2) - 4;

        IntPredicate sqrt = x -> {
            int root = (int) Math.sqrt(x);
            return root * root == x;
        };

        if (sqrt.test(teste1) && sqrt.test(teste2)){
            System.out.println("Numero "+ n + " pertence à sequência Fibonacci.");
        } else{
            System.out.println("Número " + n + " Não pertencia à Fibonacci");
        }
        scan.close();
    }
}