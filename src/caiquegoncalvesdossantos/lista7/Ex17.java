package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a primeira frase:");
        String frase = scan.nextLine();
        System.out.println("Insira a primeira frase:");
        String frase2 = scan.nextLine();

        System.out.println(IsEqualFrase(frase, frase2));

    }

    public static boolean IsEqualFrase(String frase, String frase2){
        boolean r = true;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != frase2.charAt(i)) r = false;
        }
        return r;
    }
}
