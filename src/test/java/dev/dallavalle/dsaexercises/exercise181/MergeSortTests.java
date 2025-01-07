package dev.dallavalle.dsaexercises.exercise181;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTests {
    @Test
    void applyToListOfIntegers_ListOfIntegers_ReturnsSortedList() {
        List<Integer> integers = new ArrayList<>(List.of(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

        List<Integer> actualResult = MergeSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_SimplerListOfIntegers_ReturnsSortedList() {
        List<Integer> integers = new ArrayList<>(List.of(4, 2, 3, 1));

        List<Integer> actualResult = MergeSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 2, 3, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_EmptyList_ReturnsEmptyList() {
        List<Integer> integers = new ArrayList<>();

        List<Integer> actualResult = MergeSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = Collections.emptyList();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_ListWithDuplicates_ReturnsSortedList() {
        List<Integer> integers = new ArrayList<>(List.of(4, 2, 3, 1, 2, 4));

        List<Integer> actualResult = MergeSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 2, 2, 3, 4, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_ListWithOneElement_ReturnsSameList() {
        List<Integer> integers = new ArrayList<>(List.of(42));

        List<Integer> actualResult = MergeSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(42);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_SortedList_ReturnsSameList() {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4));

        List<Integer> actualResult = MergeSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 2, 3, 4);
        assertEquals(expectedResult, actualResult);
    }
}
