package dev.dallavalle.dsaexercises.exercise161;

/**
 * ChatGPT's review of my solution: https://chatgpt.com/g/g-p-6760c3f3f1248191b19a33e80cca65ca-curso-dsa/c/676733c3-bf84-8005-85ca-37c27ca583aa
 * 
 * My TC calculation for the recursive solution is incorrect.
 */
public class FibonacciSequence {
    /**
     * TC: O(n)
     * SC: O(n)
     */
    public static long ofIndexUsingRecursion(long index) {
        if (index == 0) {
            return 0;
        }
        
        if (index == 1) {
            return 1;
        }
        
        return ofIndexUsingRecursion(index-2) + ofIndexUsingRecursion(index-1);
    }
     
    /**
     * TC: O(n)
     * SC: O(1)
     */
    public static long ofIndexUsingIteration(long resultIndex) {
        long returningAccumulator = 0;
        long firstAccumulator = 0;
        long secondAccumulator = 0;
        
        for (int index = 0; index <= resultIndex; index++) {
            if (index == 0) {
                returningAccumulator = 0;
            } else if (index == 1) {
                returningAccumulator++;
                firstAccumulator = 0;
                secondAccumulator = 1;
            } else {
                returningAccumulator = firstAccumulator + secondAccumulator;
                firstAccumulator = secondAccumulator; 
                secondAccumulator = returningAccumulator;
            }
        }
        
        return returningAccumulator;
    }
}
