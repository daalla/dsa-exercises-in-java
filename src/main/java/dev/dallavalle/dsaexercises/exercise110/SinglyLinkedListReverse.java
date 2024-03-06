package dev.dallavalle.dsaexercises.exercise110;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * In this exercise, I was given an implementation of a singly linked list and was instructed to create a reverse method
 * for it. The general implementation was neither created nor modified by me; it was provided with the exercise.
 *
 * ChatGPT's review of my solution: https://chat.openai.com/c/75c1d0d4-b59c-4b15-9eb7-a5a5d44e1d27
 */
public class SinglyLinkedListReverse<T> {
    private Node<T> head;
    private Node<T> tail;
    private long length;

    public SinglyLinkedListReverse(T value) {
        head = new Node<>(value);
        tail = head;
        length = 1;
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
        length++;
    }

    public List<T> printList() {
        List<T> list = new ArrayList<>();
        Node<T> currentNode = head;
        while (currentNode != null) {
            list.add(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
        return list;
    }

    public void insert(long index, T value) {
        if (index >= length) {
            append(value);
            return;
        }
        Node<T> newNode = new Node<>(value);
        Node<T> leader = traverseTo(index - 1);
        Node<T> holdingPointer = leader.getNextNode();
        leader.setNext(newNode);
        newNode.setNext(holdingPointer);
        length++;
    }

    private Node<T> traverseTo(long index) {
        long counter = 0;
        Node<T> currentNode = head;
        while (counter != index) {
            currentNode = currentNode.getNextNode();
            counter++;
        }
        return currentNode;
    }

    public void remove(long index) {
        Node<T> leader = traverseTo(index - 1);
        Node<T> unwantedNode = leader.getNextNode();
        leader.setNext(unwantedNode.getNextNode());
        length--;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public SinglyLinkedListReverse<T> reverse() {
        SinglyLinkedListReverse<T> reversedLinkedList = initializeReversedLinkedList();
        Node<T> pivotNode = head.getNextNode();
        while (isValid(pivotNode)) {
            T pivotNodeValue = pivotNode.getValue();
            reversedLinkedList.prepend(pivotNodeValue);
            pivotNode = pivotNode.getNextNode();
        }
        return reversedLinkedList;
    }

    private SinglyLinkedListReverse<T> initializeReversedLinkedList() {
        T headValue = head.getValue();
        return new SinglyLinkedListReverse<>(headValue);
    }

    private boolean isValid(Node<T> pivotNode) {
        return pivotNode != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinglyLinkedListReverse<?> that = (SinglyLinkedListReverse<?>) o;
        return length == that.length && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, length);
    }
}
