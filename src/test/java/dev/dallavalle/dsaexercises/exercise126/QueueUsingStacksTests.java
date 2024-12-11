package dev.dallavalle.dsaexercises.exercise126;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QueueUsingStacksTests {
    @Test
    void proposedTestByTheCourse() {
        QueueUsingStacks<String> queueUsingStacks = new QueueUsingStacks<>();
        assertThrows(EmptyStackException.class, queueUsingStacks::peek);
        queueUsingStacks.push("Joy");
        queueUsingStacks.push("Matt");   
        queueUsingStacks.push("Pavel");
        assertEquals("Joy", queueUsingStacks.peek());
        assertEquals("Joy", queueUsingStacks.pop());
        assertEquals("Matt", queueUsingStacks.pop());
        assertEquals("Pavel", queueUsingStacks.pop());
        assertThrows(EmptyStackException.class, queueUsingStacks::peek);
    }
}
