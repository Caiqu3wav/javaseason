package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int length = input.length();
        StringBuilder result = new StringBuilder();

        int start = 0;
        int end = length - 1;

        while (start <= end) {
            result.append(input.charAt(start));
            if (start != end) {
                result.append(input.charAt(end));
            }
            start++;
            end--;
        }

        System.out.println("Resultado: " + result.toString());

        scanner.close();
    }
}