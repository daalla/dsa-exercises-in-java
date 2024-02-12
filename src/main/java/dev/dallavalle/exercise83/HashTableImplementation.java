package dev.dallavalle.exercise83;

import java.util.NoSuchElementException;

/**
 * ChatGPT review of my solution: https://chat.openai.com/c/e9c886da-a6b6-4346-82c0-374fd35fb933
 *
 * Time complexity: It's O(1) if there aren't collisions and O(n) if there are collisions). If we take into account the
 *     key length when hashing, we would have to add an "m" term, resulting in O(m) or O(n + m).
 * Space complexity: O(1)
 */
public class HashTableImplementation {
    private static final int MINIMUM_CHARACTERS_FOR_KEYS = 2;

    private final IntegerBucket[] data;

    public HashTableImplementation(int hashTableSize) {
        data = new IntegerBucket[hashTableSize];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }
        return hash;
    }

    public void setValueByKey(int value, String key) {
        validateKeyLength(key);
        int keyHash = hash(key);
        setKeyAndValueByKeyHash(key, value, keyHash);
    }

    private void validateKeyLength(String key) {
        if (key.length() < MINIMUM_CHARACTERS_FOR_KEYS) {
            throw new IllegalArgumentException("A key of less than 2 characters was entered");
        }
    }

    private void setKeyAndValueByKeyHash(String key, int value, int keyHash) {
        if (data[keyHash] == null) {
            data[keyHash] = new IntegerBucket(key, value);
        } else if (isKeyEqualToKeyHashCandidate(key, keyHash)) {
            data[keyHash].set(value);
        } else {
            data[keyHash].addCollisionWithKeyAndValue(key, value);
        }
    }

    private boolean isKeyEqualToKeyHashCandidate(String keyToCompare, int keyHash) {
        String candidateKey = data[keyHash].getKey();
        return keyToCompare.equals(candidateKey);
    }

    public int getValueBy(String key) {
        int keyHash = hash(key);

        if (data[keyHash] == null) {
            throw new NoSuchElementException(
                String.format("No pair The hashmap does not have an element with key \"%s\"", key));
        } else if (isKeyEqualToKeyHashCandidate(key, keyHash)){
            return data[keyHash].getValue();
        } else {
            return data[keyHash].resolveCollisionBy(key);
        }
    }
}
