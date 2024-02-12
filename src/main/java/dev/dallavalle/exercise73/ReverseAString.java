package dev.dallavalle.exercise73;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise instructions: "Create a function that reverses a string"
 * ChatGPT review of my solution: https://chat.openai.com/c/474bd526-57d4-488d-be97-801268513594
 */
public class ReverseAString {
    public String reverse(String stringToReverse) {
        List<Character> reversedStringAsList = getReversedStringAsList(stringToReverse);
        return convertListToString(reversedStringAsList);
    }

    private List<Character> getReversedStringAsList(String stringToReverse) {
        List<Character> reversedStringAsList = new ArrayList<>();

        int stringFinalPosition = stringToReverse.length() - 1;

        for (int currentIndex = stringFinalPosition; currentIndex >= 0; currentIndex--) {
            char currentCharacter = stringToReverse.charAt(currentIndex);
            reversedStringAsList.add(currentCharacter);
        }

        return reversedStringAsList;
    }

    private String convertListToString(List<Character> reversedStringAsList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char character : reversedStringAsList) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}
