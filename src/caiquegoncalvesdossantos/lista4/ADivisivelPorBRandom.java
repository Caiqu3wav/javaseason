package collage.lista4;

public class ADivisivelPorBRandom {
    public static void main(String[] args) {

        double a = Math.random() * 1000;
        double b = Math.random() * 1000;

        System.out.println(a % b == 0 ? "a: " + a + " é divisivel por b: " + b :
                "a: " + a + " é divisivel por b: " + b);
    }
}
