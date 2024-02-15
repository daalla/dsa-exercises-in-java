package dev.dallavalle.dsaexercises.exercise99;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
    }

    public void append(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
