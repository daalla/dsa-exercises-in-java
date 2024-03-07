package dev.dallavalle.dsaexercises.exercise122;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Now the instructions are to convert the exercise 120 linked list stack to use an array as its internal data
 * structure.
 *
 * ChatGPT's review of my solution: https://chat.openai.com/c/08b31937-ec09-4530-a452-2de04a7e25a6
 */
public class ArrayListStack<T> {
    private final List<T> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public Optional<T> peek() {
        if (stack.isEmpty()) {
            return Optional.empty();
        }

        int lastIndex = stack.size() - 1;
        T topNodeValue = stack.get(lastIndex);
        return Optional.of(topNodeValue);
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public void push(T value) {
        stack.add(value);
    }

    /**
     * Time complexity: O(1)
     * Space complexity: O(1)
     */
    public Optional<T> pop() {
        if (stack.isEmpty()) {
            return Optional.empty();
        }

        int lastIndex = stack.size() - 1;
        T topNodeValue = stack.get(lastIndex);
        stack.remove(lastIndex);
        return Optional.of(topNodeValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListStack<?> that = (ArrayListStack<?>) o;
        return Objects.equals(stack, that.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stack);
    }
}
