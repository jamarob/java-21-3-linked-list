package de.neuefische.linkedlist;

public class AnimalId {

    private static int id = 0;

    public static int setAnimalId() {
        int currentId = id;
        id++;
        return currentId;
    }

}
