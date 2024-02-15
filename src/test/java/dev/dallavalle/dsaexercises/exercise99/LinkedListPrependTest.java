package dev.dallavalle.dsaexercises.exercise99;

import org.junit.jupiter.api.Test;

class LinkedListPrependTest {
    @Test
    void prepend_ExerciseTestCase_AddValuesCorrectly() {
        LinkedListPrepend linkedList = new LinkedListPrepend<>(10);
        linkedList.append(5);
        linkedList.append(16);
        linkedList.prepend(1);

        // todo: add test assertion
    }
}
