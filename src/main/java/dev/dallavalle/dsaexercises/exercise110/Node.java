package dev.dallavalle.dsaexercises.exercise110;

import java.util.Objects;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node<T> node) {
        nextNode = node;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value) && Objects.equals(nextNode, node.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, nextNode);
    }
}
