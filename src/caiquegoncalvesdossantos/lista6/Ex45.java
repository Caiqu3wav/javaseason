package caiquegoncalvesdossantos.lista6;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Coloque o número de fatoriais");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o número " + i + ":");
            int f = scan.nextInt();

            while (f < 0) {
                System.out.println("Número inválido. Digite um número não negativo:");
                f = scan.nextInt();
            }

            long fatorial = calcularFatorial(f);

            System.out.println("Fatorial de " + f + " é: " + fatorial);
        }

        scan.close();
    }

    public static long calcularFatorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
            System.out.print(i);
            System.out.print(i != num ? " * " : " ");
        }
        return resultado;
    }
}