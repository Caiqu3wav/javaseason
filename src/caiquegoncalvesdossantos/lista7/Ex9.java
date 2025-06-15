package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que quer detectar espaços:");
        String frase = scan.nextLine();

        System.out.println(QuantosA(frase));
    }

    public static int QuantosA(String frase){
        int count = 0;

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' ') count++;
        }
        return count;
    }
}
