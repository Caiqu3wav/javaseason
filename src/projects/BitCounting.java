package projects;

public class BitCounting {
    public static int countBits(int n) {
        String nStr = Integer.toString(n);
        int nu = 0;
        StringBuilder nBits = new StringBuilder();
        if (n > 0) {
            for (int i = 0; i < nStr.length(); i++){
                nBits.append(Integer.toBinaryString(n));
            }
        }
        return nu;
    }
}
