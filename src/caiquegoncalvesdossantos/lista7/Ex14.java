package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o frase que quer detectar trocar a's:");
        String frase = scan.nextLine();

        System.out.println("Frase nova: " + frase.replaceAll("a", "*"));
    }
}
