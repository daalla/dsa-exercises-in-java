package dev.dallavalle.dsaexercises.exercise83;

public class IntegerBucket {
    private String key;
    private int value;
    private IntegerBucket collisionPointer;

    public IntegerBucket(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public void addCollisionWithKeyAndValue(String key, int value) {
        if (isLastCollisionBy(key)) {
            collisionPointer = new IntegerBucket(key, value);
        } else {
            collisionPointer.addCollisionWithKeyAndValue(key, value);
        }
    }

    private boolean isLastCollisionBy(String key) {
        return key.equals(this.key) || collisionPointer == null;
    }

    public String getKey() {
        return key;
    }

    public void set(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int resolveCollisionBy(String key) {
        if (isLastCollisionBy(key)) {
            return value;
        } else {
            return collisionPointer.resolveCollisionBy(key);
        }
    }
}
