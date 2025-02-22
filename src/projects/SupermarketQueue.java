package projects;
public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] filas = new int[n];

         for (int i = 0; i < customers.length; i++) {
            // Encontre a fila menos ocupada
            int indiceMenorFila = 0;
            for (int j = 1; j < n; j++) {
                if (filas[j] < filas[indiceMenorFila]) {
                    indiceMenorFila = j;
                }
            }
            // Adicione o cliente a essa fila
            filas[indiceMenorFila] += customers[i];
        }

        // O tempo total é o maior valor entre as filas
        int totalTime = 0;
        for (int fila : filas) {
            if (fila > totalTime) {
                totalTime = fila;
            }
        }

        return totalTime;
    }

    public static void main(String[] args) {
        int[] numbers = {5,3,4};

        System.out.println(solveSuperMarketQueue(numbers, 1));
    }
}
