package dev.dallavalle.dsaexercises.exercise174;

import java.util.List;

/**
 * ChatGPT's review of my solution: https://chatgpt.com/g/g-p-6760c3f3f1248191b19a33e80cca65ca-curso-dsa/c/6770e4cf-e878-8005-8926-661b43ad9efc
 * My space complexity calc is incorrect (the review explains why).
 */
public class SelectionSort {
    /** TC: O(n^2), SC: O(1) */
    public static List<Integer> applyToListOfIntegers(List<Integer> integers) {
        for (int firstIndex = 0; firstIndex < integers.size(); firstIndex++) {
            Integer minimumInteger = null;
            Integer minimumPosition = null;
            for (int secondIndex = firstIndex; secondIndex < integers.size(); secondIndex++) {
                if (minimumInteger == null || minimumInteger > integers.get(secondIndex)) {
                    minimumInteger = integers.get(secondIndex);
                    minimumPosition = secondIndex;
                }
            }
            integers.remove(minimumPosition.intValue());
            integers.add(firstIndex, minimumInteger);
        }
        return integers;
    }
}
