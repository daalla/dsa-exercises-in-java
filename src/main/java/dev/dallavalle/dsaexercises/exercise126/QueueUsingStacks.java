package dev.dallavalle.dsaexercises.exercise126;

import java.util.Stack;

/**
 * Exercise instructions: Implement a queue using stacks.
 * ChatGPT's review of my solution: https://chatgpt.com/c/67593131-1290-8005-89ca-095febfbe01a 
 */
class QueueUsingStacks<T> {
    private final Stack<T> queueState;
    private final Stack<T> forDeque;
    private long length;

    public QueueUsingStacks() {
        queueState = new Stack<>();
        forDeque = new Stack<>();
        length = 0;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public void push(T x) {
        queueState.push(x);
        length++;   
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public T pop() {
        moveValuesFromQueueStateToAuxiliaryStack();
        T valueToReturn = forDeque.pop();
        moveValuesFromAuxiliaryStackToQueueState();
        length--;
        return valueToReturn;
    }

    private void moveValuesFromAuxiliaryStackToQueueState() {
        while (!forDeque.empty()) {
            T valueToMove = forDeque.pop();
            queueState.push(valueToMove);
        }
    }

    private void moveValuesFromQueueStateToAuxiliaryStack() {
        while (!queueState.empty()) {
            T valueToMove = queueState.pop();
            forDeque.push(valueToMove);
        }
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public T peek() {
        moveValuesFromQueueStateToAuxiliaryStack();
        T valueToReturn = forDeque.peek();
        moveValuesFromAuxiliaryStackToQueueState();
        return valueToReturn;
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public boolean empty() {
        return length == 0;
    }
}
