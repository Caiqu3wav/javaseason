package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a frase:");
        String frase = scan.nextLine();

        System.out.println(SameWordFrase(frase));
    }

    public static int SameWordFrase(String frase) {
        String[] fraseArr = frase.split(" ");
        int count = 0;

        for (int i = 0; i < fraseArr.length; i++) {
            if (fraseArr[i].contains(fraseArr[0])) count++;
        }
        return count;
    }
}
