package dev.dallavalle.dsaexercises.exercise73;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseAStringTest {
    @Test
    void reverse_ValidString_ReturnsReversedString() {
        String testString = "Hi, my name is Andrei";
        String expectedString = "ierdnA si eman ym ,iH";
        ReverseAString exercise73 = new ReverseAString();

        String returnedString = exercise73.reverse(testString);

        assertEquals(expectedString, returnedString);
    }
}
