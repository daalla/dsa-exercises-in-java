package dev.dallavalle.dsaexercises.exercise107;

import java.util.ArrayList;
import java.util.List;

/**
 * The exercise instructions were to transform a given singly linked list into a doubly linked one. There might be some
 * missing input validations and considerations for edge cases. This omission is intentional, as the provided code did
 * not include these considerations, and the essence of the exercise is not focused on comprehensive error handling but
 * rather on understanding the differences between singly and doubly linked lists. Additionally, I chose not to modify
 * the original code to adhere to "clean code" principles, opting instead to reuse it as it was given for the same
 * reason.
 *
 * ChatGPT's review of my solution: https://chat.openai.com/c/ca8f0ba8-c9c7-44aa-a2f1-070909fb2526
 */
public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private long length;

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public DoublyLinkedList(T value) {
        head = new DoublyNode<>(value);
        tail = head;
        length = 1;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public DoublyLinkedList<T> append(T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value);
        newNode.setPreviousNode(tail);
        tail.setNextNode(newNode);
        tail = newNode;
        length++;
        return this;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public DoublyLinkedList<T> prepend(T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value);
        head.setPreviousNode(newNode);
        newNode.setNextNode(head);
        head = newNode;
        length++;
        return this;
    }

    public void printList() {
        List<T> list = new ArrayList<>();
        DoublyNode<T> currentNode = head;
        while (currentNode != null) {
            list.add(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
        System.out.println(list);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public DoublyLinkedList<T> insert(long index, T value) {
        if (index >= length) {
            return append(value);
        }

        if (index == 0) {
            return prepend(value);
        }

        DoublyNode<T> newNode = new DoublyNode<>(value);
        DoublyNode<T> leader = traverseToIndex(index - 1);
        DoublyNode<T> holdingPointer = leader.getNextNode();
        leader.setNextNode(newNode);
        newNode.setPreviousNode(leader);
        newNode.setNextNode(holdingPointer);
        holdingPointer.setPreviousNode(newNode);
        length++;
        return this;
    }

    private DoublyNode<T> traverseToIndex(long index) {
        DoublyNode<T> targetNode;

        if (isIndexLessThanHalfLength(index)) {
            targetNode = traverseFromHead(index);
        } else {
            targetNode = traverseFromTail(index);
        }

        return targetNode;
    }

    private boolean isIndexLessThanHalfLength(long index) {
        long halfLength = length / 2;
        return index < halfLength;
    }

    private DoublyNode<T> traverseFromHead(long desiredIndex) {
        DoublyNode<T> pivotNode = head;

        for (long currentIndex = 0; currentIndex < desiredIndex; currentIndex++) {
            pivotNode = pivotNode.getNextNode();
        }

        return pivotNode;
    }

    private DoublyNode<T> traverseFromTail(long desiredIndex) {
        DoublyNode<T> pivotNode = tail;

        long tailIndex = length - 1;
        for (long currentIndex = tailIndex; currentIndex > desiredIndex; currentIndex--) {
            pivotNode = pivotNode.getPreviousNode();
        }

        return pivotNode;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public DoublyLinkedList<T> remove(long index) {
        DoublyNode<T> leader = traverseToIndex(index - 1);
        DoublyNode<T> unwantedNode = leader.getNextNode();
        DoublyNode<T> nodeAfterSelectedNode = unwantedNode.getNextNode();
        leader.setNextNode(nodeAfterSelectedNode);
        nodeAfterSelectedNode.setPreviousNode(leader);
        length--;
        return this;
    }
}
