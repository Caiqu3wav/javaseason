package caiquegoncalvesdossantos.lista7;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira os binários:");
        String binarys = scan.nextLine();

        System.out.println(MaxSequence(binarys));
    }

    public static int MaxSequence(String binary) {
        int maxCount = 0;
        int atualCount = 0;

        for (char c : binary.toCharArray()){
            if (c == '1') {
                atualCount++;
                if (atualCount > maxCount){
                    maxCount = atualCount;
                }
            } else {
                atualCount = 0;
            }
        }

        return maxCount;
    }
}
