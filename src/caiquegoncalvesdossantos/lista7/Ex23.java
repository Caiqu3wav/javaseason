package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a seu nome completo:");
        String frase = scan.nextLine();

        System.out.println(SameWordFrase(frase));
    }

    public static String SameWordFrase(String nome) {
        String[] nomeArr = nome.split(" ");
        int palavras = nomeArr.length;

        return nomeArr[palavras - 1];
    }
}
