package dev.dallavalle.dsaexercises.exercise120;

import java.util.Objects;
import java.util.Optional;

/**
 * I was given a code implementation of a linked list stack and was told to create its peek, push and pop methods.
 *
 * ChatGPT's review of my solution: https://chat.openai.com/c/2b3cb171-1df6-44e3-af77-0e22dcf77617
 */
public class LinkedListStack<T> {
    private Node<T> top;
    private long length;

    public LinkedListStack() {
        top = null;
        length = 0;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public Optional<T> peek() {
        if (isEmpty()) {
            return Optional.empty();
        }

        T topNodeValue = top.getValue();
        return Optional.of(topNodeValue);
    }

    private boolean isEmpty() {
        return length <= 0;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public void push(T value) {
        Node<T> nodeToStack = new Node<>(value);
        nodeToStack.setNext(top);
        top = nodeToStack;
        length++;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public Optional<T> pop() {
        if (isEmpty()) {
            return Optional.empty();
        }

        T topNodeValue = top.getValue();
        top = top.getNextNode();
        length--;
        return Optional.of(topNodeValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedListStack<?> that = (LinkedListStack<?>) o;
        return length == that.length && Objects.equals(top, that.top);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, length);
    }
}
