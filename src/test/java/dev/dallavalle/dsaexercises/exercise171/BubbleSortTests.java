package dev.dallavalle.dsaexercises.exercise171;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BubbleSortTests {
    @Test
    void providedByTheCourse() {
        List<Integer> numbersToSort = new ArrayList<>(List.of(6, 5, 3, 1, 8, 7, 2, 4));

        List<Integer> actualResult = BubbleSort.applyToListOfNumbers(numbersToSort);

        List<Integer> expectedResult = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfNumbers_EmptyList_ReturnsEmptyList() {
        List<Integer> numbersToSort = new ArrayList<>();

        List<Integer> actualResult = BubbleSort.applyToListOfNumbers(numbersToSort);

        List<Integer> expectedResult = Collections.emptyList();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfNumbers_ListWithOnlyOneNumber_ReturnsSameList() {
        List<Integer> numbersToSort = new ArrayList<>(List.of(1));

        List<Integer> actualResult = BubbleSort.applyToListOfNumbers(numbersToSort);

        List<Integer> expectedResult = List.of(1);
        assertEquals(expectedResult, actualResult);
    }
}
