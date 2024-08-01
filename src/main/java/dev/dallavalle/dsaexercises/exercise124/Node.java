package dev.dallavalle.dsaexercises.exercise124;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public T getValue() {
        return value;
    }
}
