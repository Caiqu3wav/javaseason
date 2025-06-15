package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a sequência binária:");
        String bytes = scan.nextLine();

        System.out.println(Is8Bits(bytes));
    }

    public static boolean Is8Bits(String sequency){
        if (sequency.length() == 8) {
            for (int i = 0; i < sequency.length(); i++) {
                if (sequency.charAt(i) != '0' && sequency.charAt(i) != '1') return false;
            }
        } else return false;
        return true;
    }
}
