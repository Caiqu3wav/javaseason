package projects;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int limit = 40;
        ArrayList<Integer> fibonacci = Fibo(limit);
        System.out.println(fibonacci);
    }

    public static ArrayList<Integer> Fibo(int limit) {

        int[] fibNs = {0, 1};
        ArrayList<Integer> fibResults = new ArrayList<>();

        while(fibNs[1] < limit) {
            fibResults.add(fibNs[1]);

            int nextFib = fibNs[0] + fibNs[1];
            fibNs[0] = fibNs[1];
            fibNs[1] = nextFib;
            }

        return fibResults;
        }
    }
