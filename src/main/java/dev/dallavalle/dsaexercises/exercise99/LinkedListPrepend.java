package dev.dallavalle.dsaexercises.exercise99;

/**
 * ChatGPT's review of my solution: https://chat.openai.com/c/184d0b57-0539-4498-98c2-53eba009f122
 */
public class LinkedListPrepend<T> {
    private Node<T> head;
    private Node<T> tail;
    private long length;

    public LinkedListPrepend(T value) {
        head = new Node<>(value);
        tail = head;
        length = 1;
    }

    public void append(T value) {
        Node<T> newNode = initializeNewNodeBy(value);
        tail.append(newNode);
        tail = newNode;
        length++;
    }

    private Node<T> initializeNewNodeBy(T value) {
        return new Node<>(value);
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public void prepend(T value) {
        Node<T> newNode = initializeNewNodeBy(value);
        newNode.append(head);
        head = newNode;
        length++;
    }
}
