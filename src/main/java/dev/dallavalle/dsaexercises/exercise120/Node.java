package dev.dallavalle.dsaexercises.exercise120;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
        nextNode = null;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> nodeToStack) {
        nextNode = nodeToStack;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }
}
