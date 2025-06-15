package projects;

public class TriangleNumbers {

    public static  void main(String[] args) {
        int n = 6;
        isTriangleNumber(n);
    }
    public static boolean isTriangleNumber(long number) {
        int count = 1;

        for(int i = 1; i < number++; i++) {
            ++count;

            if(i + count > (int)number) {
                System.out.print("Não triangulo");
            }
        }

        return true;
    }
}