package dev.dallavalle.dsaexercises.exercise110;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinglyLinkedListReverseTest {
    @Test
    void reverse_ThreeNodeLinkedList_ReturnsReversedLinkedList() {
        SinglyLinkedListReverse<Integer> linkedList = createThreeNodeLinkedList();

        SinglyLinkedListReverse<Integer> returnedLinkedList = linkedList.reverse();

        SinglyLinkedListReverse<Integer> expectedLinkedList = createExpectedThreeNodeLinkedList();
        assertEquals(expectedLinkedList, returnedLinkedList);
    }

    private SinglyLinkedListReverse<Integer> createThreeNodeLinkedList() {
        SinglyLinkedListReverse<Integer> linkedList = new SinglyLinkedListReverse<>(5);
        linkedList.append(10);
        linkedList.append(20);
        return linkedList;
    }

    private SinglyLinkedListReverse<Integer> createExpectedThreeNodeLinkedList() {
        SinglyLinkedListReverse<Integer> expectedLinkedList = new SinglyLinkedListReverse<Integer>(20);
        expectedLinkedList.append(10);
        expectedLinkedList.append(5);
        return expectedLinkedList;
    }

    @Test
    void reverse_TwoNodeLinkedList_ReturnsReversedLinkedList() {
        SinglyLinkedListReverse<Integer> linkedList = createTwoNodeLinkedList();

        SinglyLinkedListReverse<Integer> returnedLinkedList = linkedList.reverse();

        SinglyLinkedListReverse<Integer> expectedLinkedList = createExpectedTwoNodeLinkedList();
        assertEquals(expectedLinkedList, returnedLinkedList);
    }

    private SinglyLinkedListReverse<Integer> createTwoNodeLinkedList() {
        SinglyLinkedListReverse<Integer> linkedList = new SinglyLinkedListReverse<>(5);
        linkedList.append(10);
        return linkedList;
    }

    private SinglyLinkedListReverse<Integer> createExpectedTwoNodeLinkedList() {
        SinglyLinkedListReverse<Integer> expectedLinkedList = new SinglyLinkedListReverse<Integer>(10);
        expectedLinkedList.append(5);
        return expectedLinkedList;
    }

    @Test
    void reverse_SingleNodeLinkedList_ReturnsEqualLinkedList() {
        SinglyLinkedListReverse<Integer> linkedList = new SinglyLinkedListReverse<>(5);

        SinglyLinkedListReverse<Integer> returnedLinkedList = linkedList.reverse();

        assertEquals(linkedList, returnedLinkedList);
    }
}
