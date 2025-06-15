package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que quer detectar digitos:");
        String frase = scan.nextLine();

        System.out.println(DigitOrNo(frase));

    }

    public static boolean DigitOrNo(String frase){
        boolean r = false;
        for(int i = 0; i < frase.length(); i++){
            if(Character.isDigit(frase.charAt(i))) r = true;
        }
        return r;
    }
}
