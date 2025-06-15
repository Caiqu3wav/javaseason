package caiquegoncalvesdossantos.lista6;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();


        for (int i = 1; i <= 7; i++) {
            System.out.println("Informe o número " + i + ":");
            int n = scan.nextInt();

            while (n < 0) {
                System.out.println("Número inválido. Digite um número não negativo:");
                n = scan.nextInt();
            }

            long fatorial = calcularFatorial(n);

            System.out.println("Fatorial de " + n + " é: " + fatorial);
        }

        scan.close();
    }

    public static long calcularFatorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}