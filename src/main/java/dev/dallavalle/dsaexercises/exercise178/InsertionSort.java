package dev.dallavalle.dsaexercises.exercise178;

import java.util.List;

/** ChatGPT's review of my solution: https://chatgpt.com/g/g-p-6760c3f3f1248191b19a33e80cca65ca-curso-dsa/c/6770ffbb-b238-8005-a8ba-bd005dad00d9 */
public class InsertionSort {
    /** TC: O(n^2), SC: O(n) */
    public static List<Integer> applyToListOfIntegers(List<Integer> integers) {
        for (int orderingIndex = 1; orderingIndex < integers.size(); orderingIndex++) {
            int pivotIndex = orderingIndex;
            if (integers.get(orderingIndex) < integers.get(orderingIndex - 1)) {
                while (pivotIndex - 1 >= 0 && integers.get(orderingIndex) < integers.get(pivotIndex - 1)) {
                    pivotIndex--;
                }
                integers.add(pivotIndex, integers.get(orderingIndex));
                integers.remove(orderingIndex + 1);
            }
        }
        return integers;
    }
}
