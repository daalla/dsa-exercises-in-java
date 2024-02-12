package dev.dallavalle.exercise73;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
