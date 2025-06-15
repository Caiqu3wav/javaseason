package projects;

public class PersistentBugger {
    public static void main(String[] Args){
        long n = 39;
        System.out.println(persistence(n));
    }
        public static int persistence(long n) {
            long result = n;
            int c = 0;

            while(result >= 10){
                String nStr = Long.toString(result);
                long tempR = 1;

                for (int i = 0; i < nStr.length(); i++){
                    int digit = Character.getNumericValue(nStr.charAt(i));
                    tempR *= digit;
                }
                c++;
                result = tempR;
                System.out.println(result);
            }
            return (int) c;
        }
}
