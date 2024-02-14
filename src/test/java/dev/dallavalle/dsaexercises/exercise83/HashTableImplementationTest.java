package dev.dallavalle.dsaexercises.exercise83;

import dev.dallavalle.dsaexercises.exercise83.HashTableImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashTableImplementationTest {
    private HashTableImplementation hashTable;

    @BeforeEach
    void initializeClassUnderTest() {
        int hashTableSize = 5;
        hashTable = new HashTableImplementation(hashTableSize);
    }

    @Test
    void set_DoubleSetWithCollision_HandlesCollisionCorrectly() {
        hashTable.setValueByKey(10, "HDV");
        hashTable.setValueByKey(20, "DK");

        // todo: think about how I should assert this test
    }

    @Test
    void get_WithCollision_ReturnsCorrectValue() {
        hashTable.setValueByKey(10, "HDV");
        hashTable.setValueByKey(20, "DK");
        int expectedValue = 20;

        int returnedValue = hashTable.getValueBy("DK");

        assertEquals(expectedValue, returnedValue);
    }
}
