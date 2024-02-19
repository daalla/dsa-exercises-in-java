package dev.dallavalle.dsaexercises.exercise102;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatGPT's review of my solution: https://chat.openai.com/c/693e8f1f-8363-41dd-9ec5-df3299c0dbd8
 * After finishing, I discovered that it breaks when inserting a value at index 0.
 */
public class LinkedListInsert<T> {
    protected Node<T> head;
    protected Node<T> tail;
    protected long length;

    private Node<T> nodeBeforeInsert;
    private Node<T> nodeAfterInsert;

    public LinkedListInsert(T value) {
        head = new Node<>(value);
        tail = head;
        length = 1;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void insertValueByIndex(T value, long insertIndex) {
        validateInsertIndex(insertIndex);

        if (insertIndex == length) {
            append(value);
            return;
        }

        initializePivotingNodes();
        findPivotingNodes(insertIndex);
        insertNewNode(value);
    }

    private void validateInsertIndex(long insertIndex) {
        if (!isValid(insertIndex)) {
            throw new IllegalArgumentException("The insert index is invalid");
        }
    }

    private boolean isValid(long insertIndex) {
        boolean lessThanZero = isLessThanZero(insertIndex);
        boolean biggerThanLinkedListLength = isBiggerThanLinkedListLength(insertIndex);
        return !(lessThanZero || biggerThanLinkedListLength);
    }

    private boolean isLessThanZero(long insertIndex) {
        return insertIndex < 0;
    }

    private boolean isBiggerThanLinkedListLength(long insertIndex) {
        return insertIndex > length;
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        tail.setNextNode(newNode);
        tail = newNode;
        length++;
    }

    private void initializePivotingNodes() {
        nodeBeforeInsert = head;
        nodeAfterInsert = head;
    }

    private void findPivotingNodes(long insertIndex) {
        for (long currentIndex = 0; currentIndex < insertIndex; currentIndex++) {
            nodeBeforeInsert = nodeAfterInsert;
            nodeAfterInsert = nodeAfterInsert.getNextNode();
        }
    }

    private void insertNewNode(T value) {
        Node<T> nodeToInsert = new Node<>(value);
        nodeToInsert.setNextNode(nodeAfterInsert);
        nodeBeforeInsert.setNextNode(nodeToInsert);
        length++;
    }

    public void printLinkedList() {
        List<T> linkedListValues = new ArrayList<>();
        Node<T> currentNode = head;

        while (currentNode != null) {
            T currentNodeValue = currentNode.getValue();
            linkedListValues.add(currentNodeValue);
            currentNode = currentNode.getNextNode();
        }

        System.out.println(linkedListValues);
    }
}
