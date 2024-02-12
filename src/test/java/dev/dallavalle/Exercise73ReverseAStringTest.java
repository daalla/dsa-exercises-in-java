package dev.dallavalle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise73ReverseAStringTest {
    @Test
    void reverse_ValidString_ReturnsReversedString() {
        String testString = "Hi, my name is Andrei";
        String expectedString = "ierdnA si eman ym ,iH";
        Exercise73ReverseAString exercise73 = new Exercise73ReverseAString();

        String returnedString = exercise73.reverse(testString);

        assertEquals(expectedString, returnedString);
    }
}
