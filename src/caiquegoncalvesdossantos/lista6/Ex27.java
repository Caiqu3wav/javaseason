package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        int limit = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");

            for (int j = 1; j <= limit; j++) {
                System.out.print(j);
                if (j < limit) {
                    System.out.print(" ");
                }
            }
            limit--;

            System.out.println();
        }
    }
}

