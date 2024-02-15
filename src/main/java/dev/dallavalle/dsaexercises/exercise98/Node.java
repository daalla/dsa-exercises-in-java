package dev.dallavalle.dsaexercises.exercise98;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void append(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
