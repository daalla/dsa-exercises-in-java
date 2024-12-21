package dev.dallavalle.dsaexercises.exercise134;

public class BinarySearchTree { 
    private Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        
        root.insert(value);
    }
    
    public boolean lookup(int value) {
        if (root == null) {
            return false;
        }
        
        if (value == root.getValue()) {
            return true;
        }
        
        return root.lookup(value);
    }
    
    public void remove(int value) {
        // todo
    }
    
    // public void traverse(Node<T> node) {
    //     Map<String, T> tree = new HashMap<>();
    //     tree.put("value", node.getValue());
    //     tree.put("left", node.getLeft())
    // }
}
