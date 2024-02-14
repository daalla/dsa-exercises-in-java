package dev.dallavalle.dsaexercises.exercise75;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatGPT review of my solution: https://chat.openai.com/c/c1bf7c53-ba8e-45c0-8890-b954d4140b5b
 * Time complexity: O(n * m)
 * Space complexity: O(n + m)
 */
public class MergeSortedArrays {
    private int filterIndex;
    private List<Integer> mergedArray;
    private List<Integer> secondArrayCopy;

    public List<Integer> mergeSortedArrays(List<Integer> firstArray, List<Integer> secondArray) {
        initializeArrayCopies(firstArray, secondArray);
        initializeFilterIndex();
        while (!secondArrayCopy.isEmpty()) {
            mergeSecondArray();
        }
        return mergedArray;
    }

    private void initializeArrayCopies(List<Integer> firstArray, List<Integer> secondArray) {
        mergedArray = new ArrayList<>(List.copyOf(firstArray));
        secondArrayCopy = new ArrayList<>(List.copyOf(secondArray));
    }

    private void initializeFilterIndex() {
        filterIndex = 0;
    }

    private void mergeSecondArray() {
        if (filterIndex >= mergedArray.size()) {
            mergedArray.addAll(secondArrayCopy);
            secondArrayCopy.clear();
        } else if (secondArrayCopy.get(0) <= mergedArray.get(filterIndex)) {
            mergedArray.add(filterIndex, secondArrayCopy.get(0));
            secondArrayCopy.remove(0);
        } else {
            filterIndex++;
        }
    }
}
