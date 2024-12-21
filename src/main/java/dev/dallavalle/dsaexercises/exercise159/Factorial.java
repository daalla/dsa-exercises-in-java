package dev.dallavalle.dsaexercises.exercise159;

/** ChatGPT's review of my solution: https://chatgpt.com/g/g-p-675f618c16fc8191bf41677d35737bfd-grind75/c/6766802d-20a8-8005-84c7-49ebb2736cd5 */
public class Factorial {
    public static long ofUsingRecursion(long number) {
        if (number == 1) {
            return 1;
        }
        return number * ofUsingRecursion(number-1);
    }

    public static long ofUsingIteration(long number) {
        long result = number;
        for (long index = number-1; index >= 1; index--) {
            result *= index;
        }
        return result;
    }
}
