package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o caractere que quer detectar:");
        String caractere = scan.nextLine();
        System.out.println("Insira o caractere que quer detectar:");
        String frase = scan.nextLine();

        System.out.println(QuantosA(frase, caractere.charAt(0)));
    }

    public static int QuantosA(String frase, char ch){
        int count = 0;

        for(int i = 0; i < frase.length(); i++){
            char[] fraseIndex = frase.toCharArray();
            if (fraseIndex[i] == ch) count++;
        }
        return count;
    }
}
