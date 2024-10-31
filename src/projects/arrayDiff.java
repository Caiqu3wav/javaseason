package projects;

import java.util.ArrayList;
import java.util.List;

public class arrayDiffChallenge {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> resultList = new ArrayList<>();

        for (int element : a) {
            boolean foundInB = false;

            for (int itemB : b) {
                if (element == itemB) {
                    foundInB = true;
                    break;
                }
            }

            if (!foundInB) {
                resultList.add(element);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
