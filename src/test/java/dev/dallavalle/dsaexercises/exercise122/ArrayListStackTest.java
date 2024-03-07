package dev.dallavalle.dsaexercises.exercise122;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayListStackTest {
    private ArrayListStack<Integer> stack;
    private int testValue;

    @BeforeEach
    void initializeTest() {
        stack = new ArrayListStack<>();
        testValue = 42;
    }

    @Test
    void peek_StackWithElement_ReturnsElementValue() {
        stack.push(testValue);

        Optional<Integer> returnedValue = stack.peek();

        assertEquals(Optional.of(testValue), returnedValue);
    }

    @Test
    void peek_EmptyStack_ReturnsEmptyOptional() {
        Optional<Integer> returnedValue = stack.peek();

        assertTrue(returnedValue.isEmpty());
    }

    @Test
    void push_ValidValue_PushesCorrectly() {
        stack.push(testValue);

        Optional<Integer> pushedValue = stack.peek();
        assertEquals(Optional.of(testValue), pushedValue);
    }

    @Test
    void pop_EmptyStack_ReturnsEmptyOptional() {
        Optional<Integer> poppedValue = stack.pop();

        assertTrue(poppedValue.isEmpty());
    }

    @Test
    void pop_StackWithElement_ResultsInEmptyStack() {
        stack.push(testValue);

        stack.pop();

        ArrayListStack<Integer> expectedStack = new ArrayListStack<>();
        assertEquals(expectedStack, stack);
    }

    @Test
    void pop_StackWithElement_ReturnsPoppedElementValue() {
        stack.push(testValue);

        Optional<Integer> poppedValue = stack.pop();

        assertEquals(Optional.of(testValue), poppedValue);
    }
}
