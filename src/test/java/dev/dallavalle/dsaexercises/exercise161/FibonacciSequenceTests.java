package dev.dallavalle.dsaexercises.exercise161;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTests {
    @Test
    void ofIndexUsingRecursion_IndexZero_ReturnsZero() {
        long actualResult = FibonacciSequence.ofIndexUsingRecursion(0);
        
        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingRecursion_IndexOne_ReturnsOne() {
        long actualResult = FibonacciSequence.ofIndexUsingRecursion(1);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingRecursion_IndexTwo_ReturnsOne() {
        long actualResult = FibonacciSequence.ofIndexUsingRecursion(2);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingRecursion_IndexThree_ReturnsTwo() {
        long actualResult = FibonacciSequence.ofIndexUsingRecursion(3);

        long expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    void ofIndexUsingRecursion_IndexSix_ReturnsEight() {
        long actualResult = FibonacciSequence.ofIndexUsingRecursion(6);

        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    void ofIndexUsingIteration_IndexZero_ReturnsZero() {
        long actualResult = FibonacciSequence.ofIndexUsingIteration(0);

        long expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingIteration_IndexOne_ReturnsOne() {
        long actualResult = FibonacciSequence.ofIndexUsingIteration(1);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingIteration_IndexTwo_ReturnsOne() {
        long actualResult = FibonacciSequence.ofIndexUsingIteration(2);

        long expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingIteration_IndexThree_ReturnsTwo() {
        long actualResult = FibonacciSequence.ofIndexUsingIteration(3);

        long expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void ofIndexUsingIteration_IndexSix_ReturnsEight() {
        long actualResult = FibonacciSequence.ofIndexUsingIteration(6);

        long expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }
}