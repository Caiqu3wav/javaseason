package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que quer detectar consoantes:");
        String frase = scan.nextLine();

        QuantosA(frase);
    }

    public static void QuantosA(String frase){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < frase.length(); i++){
            if(!vowels.contains(String.valueOf(frase.charAt(i)))) count++;
        }
        System.out.println("Consoantes: "+ count);
    }
}
