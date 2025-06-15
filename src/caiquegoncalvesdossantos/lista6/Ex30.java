package caiquegoncalvesdossantos.lista6;

public class Ex30 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
            int count = i;

            for (int j = 1; j <= count; j++) {

                if (i % 2 != 0){
                        System.out.print(2 * j - 1);
                } else {
                    System.out.print(2 * j);
                }
                if (j < count) {
                    System.out.print(" ");
                }
}

            System.out.println();
        }
                }
}