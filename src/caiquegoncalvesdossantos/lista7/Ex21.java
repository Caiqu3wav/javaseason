package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a frase:");
        String frase = scan.nextLine();

        WordLines(frase);
    }

    public static void WordLines(String frase) {
        String[] fraseArr = frase.split(" ");

        for (String word : fraseArr) {
            System.out.println(word);
        }
    }
}
