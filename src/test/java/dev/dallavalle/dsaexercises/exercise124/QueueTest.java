package dev.dallavalle.dsaexercises.exercise124;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QueueTest {
    /** For the sake of brevity, I only implemented the test case required by the DS&A course. */
    @Test
    void testCourseCase() {
        Queue<String> stringQueue = new Queue<>();
        String firstName = "Joy";
        String secondName = "Matt";
        String thirdName = "Pavel";
        String fourthName = "Samir";

        stringQueue.enqueue(firstName);

        assertEquals(firstName, stringQueue.peek());

        stringQueue.enqueue(secondName);
        stringQueue.enqueue(thirdName);
        stringQueue.enqueue(fourthName);

        assertEquals(firstName, stringQueue.dequeue());
        assertEquals(secondName, stringQueue.peek());

        assertEquals(secondName, stringQueue.dequeue());
        assertEquals(thirdName, stringQueue.peek());

        assertEquals(thirdName, stringQueue.dequeue());
        assertEquals(fourthName, stringQueue.peek());

        assertEquals(fourthName, stringQueue.dequeue());
        assertThrows(IllegalStateException.class, stringQueue::peek);
    }
}