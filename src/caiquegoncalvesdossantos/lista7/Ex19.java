package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a palavra:");
        String bytes = scan.nextLine();

        System.out.println(IsPalindrome(bytes));
    }

    public static boolean IsPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i))
                return false;
        }
        return true;
    }
}
