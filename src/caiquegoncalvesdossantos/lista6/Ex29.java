package caiquegoncalvesdossantos.lista6;

public class Ex29 {
    public static void main(String[] args) {
        boolean tf = true;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");

            for (int j = 1; j <= 10; j++) {
                if (tf) {
                   if (j % 2 == 0) System.out.print(j);
                } else {
                    if (j % 2 != 0) System.out.print(j);
                }

                if (j < 10) {
                    System.out.print(" ");
                }
            }
            tf = !tf;
            System.out.println();
        }
    }
}