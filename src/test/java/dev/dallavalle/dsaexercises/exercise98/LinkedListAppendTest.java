package dev.dallavalle.dsaexercises.exercise98;

import org.junit.jupiter.api.Test;

class LinkedListAppendTest {
    @Test
    void append_ExerciseTestCase_AppendsValuesSuccessfully(){
        LinkedListAppend<Integer> linkedList = new LinkedListAppend<>(10);
        linkedList.append(5);
        linkedList.append(16);

        // todo: analyze how to verify this test
    }
}
