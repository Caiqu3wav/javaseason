package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a frase:");
        String frase = scan.nextLine();

        System.out.println(CountWords(frase));
    }

    public static int CountWords(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') count++;
        }
        return count;
    }
}
