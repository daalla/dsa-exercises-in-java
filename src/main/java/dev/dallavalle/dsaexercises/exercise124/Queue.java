package dev.dallavalle.dsaexercises.exercise124;

/**
 * Exercise instructions: Implement the methods peek, enqueue, dequeue and isEmpty for this class.
 *
 * ChatGPT's review of my solution: https://chatgpt.com/c/0955364e-8821-4e85-b82e-5a01c441e61a
 */
public class Queue<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private long length;

    public Queue() {
        firstNode = null;
        lastNode = null;
        length = 0;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public T peek() {
        if (length == 0) {
            throw new IllegalStateException("The queue is empty");
        }

        return firstNode.getValue();
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public void enqueue(T value) {
        if (length == 0) {
            firstNode = new Node<>(value);
            lastNode = firstNode;
            length++;
            return;
        }

        if (length == 1) {
            Node<T> newNode = new Node<>(value);
            firstNode.setNextNode(newNode);
            lastNode = newNode;
            length++;
            return;
        }

        Node<T> newNode = new Node<>(value);
        lastNode.setNextNode(newNode);
        lastNode = newNode;
        length++;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public T dequeue() {
        Node<T> returningNode;

        if (length == 0) {
            throw new IllegalStateException("The queue is already empty");
        }

        if (length == 1) {
            returningNode = firstNode;
            firstNode = null;
            lastNode = null;
            length--;
            return returningNode.getValue();
        }

        returningNode = firstNode;
        firstNode = returningNode.getNextNode();
        length--;
        return returningNode.getValue();
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public boolean isEmpty() {
        return length == 0;
    }
}
