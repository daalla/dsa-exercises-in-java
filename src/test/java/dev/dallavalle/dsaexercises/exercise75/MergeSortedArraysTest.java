package dev.dallavalle.dsaexercises.exercise75;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MergeSortedArraysTest {
    private MergeSortedArrays exercise75;

    @BeforeEach
    void initializeClassUnderTest() {
        exercise75 = new MergeSortedArrays();
    }

    @Test
    void mergeSortedArrays_ValidArrays_ReturnsMergedSortedArray() {
        List<Integer> firstArray = List.of(0, 3, 4, 31);
        List<Integer> secondArray = List.of(4, 6, 30);
        List<Integer> expectedArray = List.of(0, 3, 4, 4, 6, 30, 31);

        List<Integer> returnedArray = exercise75.mergeSortedArrays(firstArray, secondArray);

        assertEquals(expectedArray, returnedArray);
    }

    @Test
    void mergeSortedArrays_EmptyFirstArray_ReturnsSecondArrayValues() {
        List<Integer> firstArray = List.of();
        List<Integer> secondArray = List.of(4, 6, 30);

        List<Integer> returnedArray = exercise75.mergeSortedArrays(firstArray, secondArray);

        assertEquals(secondArray, returnedArray);
    }

    @Test
    void mergeSortedArrays_EmptySecondArray_ReturnsFirstArrayValues() {
        List<Integer> firstArray = List.of(0, 3, 4, 31);
        List<Integer> secondArray = List.of();

        List<Integer> returnedArray = exercise75.mergeSortedArrays(firstArray, secondArray);

        assertEquals(firstArray, returnedArray);
    }

    @Test
    void mergeSortedArrays_EmptyArrays_ReturnsEmptyArray() {
        List<Integer> emptyArray = List.of();

        List<Integer> returnedArray = exercise75.mergeSortedArrays(emptyArray, emptyArray);

        assertEquals(emptyArray, returnedArray);
    }
}
