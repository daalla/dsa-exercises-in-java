package dev.dallavalle.dsaexercises.exercise104;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// todo: add test assertions
class LinkedListRemoveTest {
    private LinkedListRemove<Integer> linkedList;

    @BeforeEach
    void initializeLinkedList() {
        linkedList = new LinkedListRemove<>(5);
    }

    @Test
    void remove_ValidInput_RemovesNodeCorrectly() {
        addTestNodes();
        int indexToRemove = 2;

        linkedList.removeBy(indexToRemove);

        int expectedLength = 3;
        assertEquals(expectedLength, linkedList.getLength());
    }

    private void addTestNodes() {
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(40);
    }

    @Test
    void remove_FirstNodeIndex_RemovesFirstNode() {
        addTestNodes();
        int indexToRemove = 0;

        linkedList.removeBy(indexToRemove);

        int expectedLength = 3;
        assertEquals(expectedLength, linkedList.getLength());
    }

    @Test
    void remove_LastNodeIndex_RemovesLastNode() {
        addTestNodes();
        int indexToRemove = 3;

        linkedList.removeBy(indexToRemove);

        int expectedLength = 3;
        assertEquals(expectedLength, linkedList.getLength());
    }

    @Test
    void remove_SingleNodeLinkedList_EmptiesTheLinkedList(){
        int indexToRemove = 0;

        linkedList.removeBy(indexToRemove);

        int expectedLength = 0;
        assertEquals(expectedLength, linkedList.getLength());
    }
}
