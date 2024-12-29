package dev.dallavalle.dsaexercises.exercise178;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortTests {
    @Test
    void applyToListOfIntegers_ListOfIntegers_ReturnsSortedList() {
        List<Integer> integers = new ArrayList<>(List.of(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

        List<Integer> actualResult = InsertionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_EmptyList_ReturnsEmptyList() {
        List<Integer> integers = new ArrayList<>();

        List<Integer> actualResult = InsertionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = Collections.emptyList();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_SizeOneList_ReturnsSameList() {
        List<Integer> integers = new ArrayList<>(List.of(42));

        List<Integer> actualResult = InsertionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(42);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_SortedList_ReturnsSameList() {
        List<Integer> integers = new ArrayList<>(List.of(1, 5, 10));

        List<Integer> actualResult = InsertionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 5, 10);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_ListWithDuplicates_ReturnsSortedList() {
        List<Integer> integers = new ArrayList<>(List.of(10, 5, 5, 10, 4, 4, 2));

        List<Integer> actualResult = InsertionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(2, 4, 4, 5, 5, 10, 10);
        assertEquals(expectedResult, actualResult);
    }
}
