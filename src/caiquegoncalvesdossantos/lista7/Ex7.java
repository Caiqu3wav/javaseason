package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que letras:");
        String frase = scan.nextLine().toLowerCase();

        QuantosChar(frase);
    }

    public static void QuantosChar(String frase){
        int[] counts = new int[26];

        for(char c : frase.toCharArray()){
            if (c >= 'a' && c <= 'z'){
                counts[c - 'a']++;
            }
        }

        System.out.println("\nContagem: ");
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            System.out.println(letra + ": " + counts[i]);
        }
    }
}
