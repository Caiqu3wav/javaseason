package projects;
import java.util.*;

        public class SubArraysMaxAbs {

            public static void main(String[] args){
                int[] numbers = {1, -3, 2, 5, -4};
                System.out.println(maxAbsoluteSum(numbers)); // Saída esperada: 7
            }

            public static int maxAbsoluteSum(int[] numbers) {
                int maxSum = 0, minSum = 0, sumMax = 0, sumMin = 0;

                for (int n : numbers) {
                    sumMax += n;
                    sumMin += n;

                    maxSum = Math.max(maxSum, sumMax);
                    minSum = Math.min(minSum, sumMin);

                    if (sumMax < 0) sumMax = 0;
                    if (sumMin > 0) sumMin = 0;
                }
                return Math.max(Math.abs(minSum), maxSum);
    }
}
