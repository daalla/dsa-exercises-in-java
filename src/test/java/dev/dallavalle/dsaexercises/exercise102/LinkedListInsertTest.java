package dev.dallavalle.dsaexercises.exercise102;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// todo: add test assertions
class LinkedListInsertTest {
    private LinkedListInsert<Integer> linkedList;

    @BeforeEach
    void initializeLinkedList() {
        linkedList = new LinkedListInsert<>(5);
    }

    @Test
    void insert_ValidInput_InsertsNodeCorrectly() {
        linkedList.append(40);
        linkedList.append(32);
        linkedList.append(7);
        linkedList.insertValueByIndex(42, 2);
        linkedList.printLinkedList();
    }

    @Test
    void insert_SingleNodeLinkedList_InsertsNodeCorrectly() {
        linkedList.insertValueByIndex(42, 1);
        linkedList.printLinkedList();
    }

    @Test
    void insert_TwoNodeLinkedList_InsertsNodeCorrectly() {
        linkedList.append(20);
        linkedList.insertValueByIndex(42, 1);
        linkedList.printLinkedList();

    }

    @Test
    void printLinkedList_LinkedListWithManyValues_PrintsCorrectly() {
        linkedList.append(40);
        linkedList.append(50);
        linkedList.printLinkedList();

    }
}
