package dev.dallavalle.dsaexercises.exercise104;

import dev.dallavalle.dsaexercises.exercise102.LinkedListInsert;
import dev.dallavalle.dsaexercises.exercise102.Node;

/**
 * ChatGPT's review of my solution: https://chat.openai.com/c/664b0408-d87b-4c2d-b65e-14a52ed6472e
 */
public class LinkedListRemove<T> extends LinkedListInsert<T> {
    public LinkedListRemove(T value) {
        super(value);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void removeBy(long index) {
        validateRemoveIndex(index);

        if (index == 0) {
            removeHead();
            return;
        }

        Node<T> nodeBeforeIndex = getNodeBefore(index);
        removeNodeWith(nodeBeforeIndex);
        length--;
    }

    private void validateRemoveIndex(long index) {
        boolean indexLessThanZero = index < 0;
        boolean indexBiggerThanLength = index >= length;

        if (indexLessThanZero || indexBiggerThanLength) {
            throw new IllegalArgumentException("The remove index is invalid");
        }
    }

    private void removeHead() {
        head = head.getNextNode();
        length--;

        boolean emptyLinkedList = length == 0;
        if (emptyLinkedList) {
            tail = null;
        }
    }

    private Node<T> getNodeBefore(long removeIndex) {
        Node<T> nodeBeforeIndex = head;

        for (long currentIndex = 0; currentIndex < (removeIndex - 1); currentIndex++) {
            nodeBeforeIndex = nodeBeforeIndex.getNextNode();
        }

        return nodeBeforeIndex;
    }

    private void removeNodeWith(Node<T> nodeBeforeIndex) {
        Node<T> nodeBeingRemoved = nodeBeforeIndex.getNextNode();
        Node<T> nodeAfterIndex = nodeBeingRemoved.getNextNode();
        nodeBeforeIndex.setNextNode(nodeAfterIndex);

        if (nodeBeingRemoved == tail) {
            tail = nodeBeforeIndex;
        }
    }

    public long getLength() {
        return length;
    }
}
