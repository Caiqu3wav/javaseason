package caiquegoncalvesdossantos.lista6;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloque o termo inicial: ");
        int termoI = scan.nextInt();
        System.out.print("Coloque o termo final: ");
        int termoF = scan.nextInt();

        int[] fiboNs = {0, 1};
        int count = 2;

        while(count <= termoF) {
            if(count > termoI) {
                System.out.print(fiboNs[0] + ", ");
            }
            int newN = fiboNs[0] + fiboNs[1];
            fiboNs[0] = fiboNs[1];
            fiboNs[1] = newN;
            count++;
        }
        System.out.print(fiboNs[0]);

        scan.close();
    }
}