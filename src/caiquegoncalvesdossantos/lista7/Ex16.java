package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que quer detectar maiúsculos:");
        String frase = scan.nextLine();

        System.out.println(AllUpperOrNo(frase));

    }

    public static boolean AllUpperOrNo(String frase){
        boolean r = true;
        for(int i = 0; i < frase.length(); i++){
            if(!Character.isUpperCase(frase.charAt(i))) return false;
        }
        return r;
    }
}
