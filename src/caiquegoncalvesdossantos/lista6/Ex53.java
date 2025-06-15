package caiquegoncalvesdossantos.lista6;

public class Ex53 {
    public static void main(String[] args) {
        int n = 250;

        int[] fiboNs = {0, 1};

        while(fiboNs[1] <= n) {
            System.out.print(fiboNs[0] + ", ");
            int newN = fiboNs[0] + fiboNs[1];
            fiboNs[0] = fiboNs[1];
            fiboNs[1] = newN;
        }
        System.out.print(fiboNs[0]);

    }
}