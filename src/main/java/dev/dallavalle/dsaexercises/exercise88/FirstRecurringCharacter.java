package dev.dallavalle.dsaexercises.exercise88;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * ChatGPT review of the solution: https://chat.openai.com/c/ce19f6ab-9aa7-40e1-a6dd-040f6d2d5db9
 */
public class FirstRecurringCharacter {
    private FirstRecurringCharacter() {
        throw new IllegalStateException("The solution does not require instantiation");
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static <T> Optional<T> getFirstRecurringCharacter(T[] characters) {
        Set<T> seenCharacters = new HashSet<>();

        for (T character : characters) {
            if (seenCharacters.contains(character)) {
                return Optional.of(character);
            } else {
                seenCharacters.add(character);
            }
        }

        return Optional.empty();
    }
}
