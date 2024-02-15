package dev.dallavalle.dsaexercises.exercise98;

/**
 * ChatGPT's review of my solution: https://chat.openai.com/c/8761cf9a-f761-4521-af1e-9f0474faf620
 * It seems I overcomplicated the solution. To be fair, I didn't consult any notes while solving it.
 */
public class LinkedListAppend<T> {
    private Node<T> head;
    private Node<T> tail;
    private long length;

    private Node<T> pivotPointer;
    private Node<T> lastNode;

    public LinkedListAppend(T value) {
        head = new Node<>(value);
        tail = head;
        length = 1;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void append(T value) {
        Node<T> newNode = initializeNewNodeBy(value);
        initializePivotPointers();
        lastNode = getLastNode();
        lastNode.append(newNode);
        tail = newNode;
        length++;
    }

    private Node<T> initializeNewNodeBy(T value) {
        return new Node<>(value);
    }

    private void initializePivotPointers() {
        pivotPointer = head;
        lastNode = head;
    }

    private Node<T> getLastNode() {
        while (!isLastNodeBy(pivotPointer)) {  // O(n)
            traverseNodes();
        }
        return lastNode;
    }

    private boolean isLastNodeBy(Node<T> pivotPointer) {
        return pivotPointer == null;
    }

    private void traverseNodes() {
        lastNode = pivotPointer;
        pivotPointer = pivotPointer.getNextNode();
    }
}
