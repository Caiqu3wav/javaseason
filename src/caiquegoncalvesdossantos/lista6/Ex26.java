package caiquegoncalvesdossantos.lista6;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Nova linha após cada linha da sequência
        }
    }
}

