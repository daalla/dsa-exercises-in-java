package dev.dallavalle.dsaexercises.exercise134;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTests {

    @Test
    void lookup_EmptyTree_ReturnFalse() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        
        boolean actualResult = binarySearchTree.lookup(10);
        
        assertFalse(actualResult);
    }
    
    @Test 
    void lookup_ValueEqualsRoot_ReturnTrue() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        
        boolean actualResult = binarySearchTree.lookup(10);
        
        assertTrue(actualResult);
    }
    
    @Test
    void lookup_ValueIsInRightLeaf_ReturnTrue() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        
        boolean actualResult = binarySearchTree.lookup(12);
        
        assertTrue(actualResult);
    }
    
    @Test
    void lookup_ValueIsInLeftLeaf_ReturnTrue() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        
        boolean actualResult = binarySearchTree.lookup(5);
        
        assertTrue(actualResult);
    }
    
    @Test
    void lookup_ValueIsNotInLeftLeaf_ReturnFalse() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        
        boolean actualResult = binarySearchTree.lookup(5);
        
        assertFalse(actualResult);
    }
    
    @Test
    void lookup_ValueIsNotInRightLeaf_ReturnFalse() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        
        boolean actualResult = binarySearchTree.lookup(15);
        
        assertFalse(actualResult);
    }
}