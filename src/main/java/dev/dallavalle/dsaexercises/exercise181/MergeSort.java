package dev.dallavalle.dsaexercises.exercise181;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatGPT's review of my solution: https://chatgpt.com/c/67748141-fc90-8005-9563-9adeaca51d78
 */
public class MergeSort {
    /**
     * TC: O(n log n)
     * SC: O(n)
     */
    public static List<Integer> applyToListOfIntegers(List<Integer> integers) {
        if (integers.size() == 1 || integers.isEmpty()) {
            return integers;
        }

        List<Integer> left;
        List<Integer> right;
        if (integers.size() > 2) {
            int middleIndex = (integers.size() - 1) / 2;
            left = new ArrayList<>(integers.subList(0, middleIndex));
            right = new ArrayList<>(integers.subList(middleIndex, integers.size()));
        } else {
            left = new ArrayList<>(List.of(integers.getFirst()));
            right = new ArrayList<>(List.of(integers.getLast()));
        }

        return merge(applyToListOfIntegers(left), applyToListOfIntegers(right));
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> newList = new ArrayList<>();

        while (!left.isEmpty() || !right.isEmpty()) {
            if ((right.isEmpty()) || (!left.isEmpty() && (left.getFirst() < right.getFirst()))) {
                newList.add(left.getFirst());
                left.removeFirst();
            } else {
                newList.add(right.getFirst());
                right.removeFirst();
            }
        }

        return newList;
    }
}
