package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a senha:");
        String senha = scan.nextLine();

        System.out.println(PassValidator(senha));
    }

    public static boolean PassValidator(String pass) {
        String regex = "!@#$%&*()+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);

        int count = 0;
        int countNs = 0;
        int countLetras = 0;

        if (pass.length() >= 10) return false;

        while (matcher.find()) {
                count++;
                if (count >= 2) {
                    break;
                }
        }

        for (char c : pass.toCharArray()){
            if (Character.isDigit(c)) countNs++;
            if (Character.isAlphabetic(c)) countNs++;
        }

        return countNs + countLetras >= 6 && count >= 2;
    }
}
