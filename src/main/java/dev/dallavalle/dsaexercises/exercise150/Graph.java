package dev.dallavalle.dsaexercises.exercise150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** ChatGPT's review of my solution: https://chatgpt.com/g/g-p-6760c3f3f1248191b19a33e80cca65ca-curso-dsa/c/6763cdf6-22dc-8005-b939-0ebfa19230f2 */
public class Graph {
    private int numberOfNodes;
    private Map<Integer, Set<Integer>> adjacentList;
    
    public Graph() {
        numberOfNodes = 0;
        adjacentList = new HashMap<>();
    }
    
    public void addVertex(int node) {
        if (adjacentList.containsKey(node)) {
            throw new IllegalArgumentException();
        }
        adjacentList.put(node, new HashSet<>());
        numberOfNodes++;
    }
    
    public void addEdge(int node1, int node2) {
        if (!adjacentList.containsKey(node1) || !adjacentList.containsKey(node2)) {
            throw new IllegalArgumentException();
        }
        Set<Integer> firstNodeAdjacents = adjacentList.get(node1);
        firstNodeAdjacents.add(node2);
        Set<Integer> secondNodeAdjacents = adjacentList.get(node2);
        secondNodeAdjacents.add(node1);
    }
}
