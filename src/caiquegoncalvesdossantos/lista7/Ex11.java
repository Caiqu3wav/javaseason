package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que quer detectar espaços:");
        String frase = scan.nextLine();

        QuantosA(frase);
    }

    public static void QuantosA(String frase){
        int count = 0;
        int countNs = 0;

        for(int i = 0; i < frase.length(); i++){
            if(Character.isAlphabetic(frase.charAt(i))) count++;
            if(Character.isDigit(frase.charAt(i))) countNs++;

        }
        System.out.println(count);
        System.out.println("Numeros: "+countNs);
    }
}
