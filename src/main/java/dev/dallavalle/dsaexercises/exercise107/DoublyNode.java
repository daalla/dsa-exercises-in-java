package dev.dallavalle.dsaexercises.exercise107;

public class DoublyNode<T> {
    private T value;
    private DoublyNode<T> nextNode;
    private DoublyNode<T> previousNode;

    public DoublyNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public DoublyNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyNode<T> previousNode) {
        this.previousNode = previousNode;
    }
}
