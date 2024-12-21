package dev.dallavalle.dsaexercises.exercise159;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTests {
    @Test
    void providedByTheCourse() {
        long actualResult = Factorial.ofUsingRecursion(5);
        
        long expectedResult = 120; 
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    void sameTestAsBeforeButUsingIteration() {
        long actualResult = Factorial.ofUsingIteration(5);

        long expectedResult = 120;
        assertEquals(expectedResult, actualResult);
    }
}
