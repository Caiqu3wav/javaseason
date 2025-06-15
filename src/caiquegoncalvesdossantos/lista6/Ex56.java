package caiquegoncalvesdossantos.lista6;

public class Ex56 {
    public static void main(String[] args) {
        int n = 1;

        while(n <= 900){
            int sum = 0;
            for(int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n){
                System.out.println(n);
            }
            n++;
        }
    }
}