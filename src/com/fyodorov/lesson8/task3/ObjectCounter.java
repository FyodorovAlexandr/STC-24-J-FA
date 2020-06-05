package com.fyodorov.lesson8.task3;

public class ObjectCounter {
    private static int objectCount = 0;

    public ObjectCounter() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}
