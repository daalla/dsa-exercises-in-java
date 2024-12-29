package dev.dallavalle.dsaexercises.exercise174;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTests {
    @Test
    void applyToListOfIntegers_ListOfNumbers_ReturnsOrderedList() {
        List<Integer> integers = new ArrayList<>(List.of(3, 2, 4, 1));

        List<Integer> actualResult = SelectionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 2, 3, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_DuplicatedNumbers_ReturnsOrderedList() {
        List<Integer> integers = new ArrayList<>(List.of(3, 2, 4, 1, 2));

        List<Integer> actualResult = SelectionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 2, 2, 3, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_EmptyList_ReturnsEmptyList() {
        List<Integer> integers = new ArrayList<>(List.of());

        List<Integer> actualResult = SelectionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = Collections.emptyList();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_OneElementList_ReturnsSameList() {
        List<Integer> integers = new ArrayList<>(List.of(42));

        List<Integer> actualResult = SelectionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(42);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void applyToListOfIntegers_OrderedList_ReturnsSameList() {
        List<Integer> integers = new ArrayList<>(List.of(1, 4, 7));

        List<Integer> actualResult = SelectionSort.applyToListOfIntegers(integers);

        List<Integer> expectedResult = List.of(1, 4, 7);
        assertEquals(expectedResult, actualResult);
    }
}
