package dev.dallavalle.dsaexercises.exercise171;

import java.util.List;

/**
 * ChatGPT's review of my solution:
 * https://chatgpt.com/g/g-p-6760c3f3f1248191b19a33e80cca65ca-curso-dsa/c/677037d0-4868-8005-9056-87fe44bba45d
 */
public class BubbleSort {
    /** TC: O(n^2) SC: O(1) */
    public static List<Integer> applyToListOfNumbers(List<Integer> numbers) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int index = 0; index < numbers.size(); index++) {
                if (index + 1 < numbers.size() && numbers.get(index) > numbers.get(index + 1)) {
                    sorted = false;
                    int numberToMove = numbers.get(index + 1);
                    numbers.set(index + 1, numbers.get(index));
                    numbers.set(index, numberToMove);
                }
            }
        }

        return numbers;
    }
}
