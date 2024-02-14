package dev.dallavalle.dsaexercises.exercise88;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstRecurringCharacterTest {
    @Test
    void getFirstRecurringCharacter_ExerciseFirstTestCase_ReturnsNumber2() {
        Integer[] numbers = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        Optional<Integer> expectedValue = Optional.of(2);

        Optional<Integer> returnedValue = FirstRecurringCharacter.getFirstRecurringCharacter(numbers);

        assertEquals(expectedValue, returnedValue);
    }

    @Test
    void getFirstRecurringCharacter_ExerciseSecondTestCase_ReturnsNumber1() {
        Integer[] numbers = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        Optional<Integer> expectedValue = Optional.of(1);

        Optional<Integer> returnedValue = FirstRecurringCharacter.getFirstRecurringCharacter(numbers);

        assertEquals(expectedValue, returnedValue);
    }

    @Test
    void getFirstRecurringCharacter_ExerciseThirdTestCase_ReturnsEmptyOptional() {
        Integer[] numbers = {2, 3, 4, 5};
        Optional<Integer> expectedValue = Optional.empty();

        Optional<Integer> returnedValue = FirstRecurringCharacter.getFirstRecurringCharacter(numbers);

        assertEquals(expectedValue, returnedValue);
    }
}
