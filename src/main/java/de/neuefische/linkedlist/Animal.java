package de.neuefische.linkedlist;

import java.util.Objects;

public class Animal {
    private String name;
    private final int id;

    public Animal(String name) {
        this.name = name;
        id=AnimalId.setAnimalId();
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return  name;
    }
}