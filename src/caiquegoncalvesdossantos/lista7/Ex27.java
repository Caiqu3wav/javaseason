package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a palavra:");
        String word = scan.nextLine();
        System.out.println("Insira a segunda palavra:");
        String word2 = scan.nextLine();

        ConcatAnalyser(word, word2);
    }

    public static void ConcatAnalyser(String w1, String w2) {
        StringBuilder result = new StringBuilder();
        if(w1.length() == w2.length()) {
            for(int i = 0; i < w1.length(); i++){
                result.append(w1.charAt(i));
                result.append(w2.charAt(i));
            }
            System.out.println(result);
        } else System.out.println("Erro! Entradas de tamanhos diferentes.\n");
    }
}
