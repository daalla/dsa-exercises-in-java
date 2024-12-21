package dev.dallavalle.dsaexercises.exercise134;

public class Node {
    private Node left;
    private Node right;
    private int value;
    
    public Node(int value) {
        left = null;
        right = null;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void insert(int value) {
        if (value == this.value) {
            return;
        }
 
        // 13:35 arranque a pensarlo
        
        if (value > this.value && right == null) {
            right = new Node(value);
        } else if (value < this.value && left == null) {
            left = new Node(value);
        } else if (value > this.value) {
            right.insert(value);    
        } else if (value < this.value) {
            left.insert(value);
        }
    }
    
    // 14:12 empecé a debuggear
    public boolean lookup(int value) {
        if (value == this.value) {
            return true;
        } else if (value > this.value && right != null) {
            return right.lookup(value);
        } else if (value < this.value && left != null) {
            return left.lookup(value);
        } 
        
        return false;
    }
    
    // 14:02 empece a pensarlo
    public void remove(int value) {
        // if (value > this.value && right == null) {
        //     return false;
        // } else if (value < this.value && left == null) {
        //     return false;
        // } else if (value > this.value) {
        //     right.lookup(value);
        // } else if (value < this.value) {
        //     left.lookup(value);
        // }
    }
}
