package dev.dallavalle.dsaexercises.exercise134;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeTests {
    @Test
    public void proposedByTheCourse() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(20);
        binarySearchTree.insert(170);
        binarySearchTree.insert(15);
        binarySearchTree.insert(1);
        binarySearchTree.insert(170);
        
        assertTrue(binarySearchTree.lookup(9)); 
        assertFalse(binarySearchTree.lookup(90));
        assertTrue(binarySearchTree.lookup(20));
        assertTrue(binarySearchTree.lookup(170));
        assertFalse(binarySearchTree.lookup(171));
    }
}
