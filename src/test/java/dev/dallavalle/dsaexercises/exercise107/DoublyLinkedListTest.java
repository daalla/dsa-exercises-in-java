package dev.dallavalle.dsaexercises.exercise107;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// todo: add test assertions
class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> doublyLinkedList;

    @BeforeEach
    void initializeLinkedList() {
        doublyLinkedList = new DoublyLinkedList<>(5);
    }

    @Test
    void append_ThreeNodeLinkedList_AppendsNodesSuccessfully() {
        doublyLinkedList.append(10);
        doublyLinkedList.append(20);
    }

    @Test
    void prepend_ThreeNodeLinkedList_PrependsNodesSuccessfully() {
        doublyLinkedList.prepend(4);
        doublyLinkedList.prepend(3);
    }

    @Test
    void insert_InTheMiddleOfAFourNodeLinkedList_InsertsCorrectly() {
        doublyLinkedList.append(10);
        doublyLinkedList.append(40);
        doublyLinkedList.append(80);
        doublyLinkedList.insert(2, 20);
    }

    @Test
    void insert_InThePenultimateIndex_InsertsCorrectly() {
        doublyLinkedList.append(10);
        doublyLinkedList.append(20);
        doublyLinkedList.append(80);
        doublyLinkedList.insert(3, 40);
    }

    @Test
    void remove_ValidIndex_RemovesCorrectly() {
        doublyLinkedList.append(10);
        doublyLinkedList.append(20);
        doublyLinkedList.append(40);
        doublyLinkedList.remove(2);
    }
}
