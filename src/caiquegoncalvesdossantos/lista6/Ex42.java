package caiquegoncalvesdossantos.lista6;

public class Ex42 {

    public static void main(String[] args) {
        int multFatoriais = 10;
        int count = 9;

        System.out.println("De 1 até n/2:");
        for (int i = 10; i > 1; i--) {
            System.out.print(i + " x " + count);
            multFatoriais *= count;
            count--;
            if (i > 2) {
                System.out.print(", ");
            }
        }
        System.out.println("\n"+multFatoriais);
    }
}